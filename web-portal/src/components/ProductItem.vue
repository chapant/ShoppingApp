<template>
  <div class="col-md-4">
    <div class="card mb-4">
      <img :src="product.product_image" class="card-img-top" alt="Product Image">
      <div class="card-body">
        <h5 class="card-title">{{ product.product_title }}</h5>
        <p class="card-text">{{ product.product_desc }}</p>
        <p class="card-text"><strong>${{ product.product_price }}</strong></p>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  props: {
    product: Object,
  },
};
</script>
