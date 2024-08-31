<template>
  <div class="container mt-4">
    <div class="row">
      <ProductItem
          v-for="product in products"
          :key="product.product_id"
          :product="product"
      />
    </div>
  </div>
</template>

<script>
import axios from 'axios';
import ProductItem from './ProductItem.vue';

export default {
  components: {
    ProductItem,
  },
  data() {
    return {
      products: [],
    };
  },
  created() {
    this.fetchProducts();
  },
  methods: {
    fetchProducts() {
      axios.get('/api/product/all')
          .then(response => {
            this.products = response.data;
          })
          .catch(error => {
            console.error('Error fetching products:', error);
          });
    },
  },
};
</script>
