<template>
  <div class="col-md-3 col-sm-6 mb-3">
    <div class="card h-100">
      <img :src="`/api/images/product/${product.product_image}`" class="card-img-top" alt="...">
      <div class="card-body">
        <h5 class="card-title">{{ product.product_title }}</h5>
        <p class="card-text">{{ product.product_desc }}</p>
        <p class="card-text text-muted">{{ product.product_keywords }}</p>
        <h6 class="text-primary">${{ product.product_price }}</h6>
        <button class="btn btn-warning w-100">Add to Cart</button>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'ProductItem',
  props: {
    product: Object,
  },
};
</script>

<style scoped>
.card-img-top {
  max-height: 200px;
  object-fit: contain;
}
.card-title {
  font-size: 1.25rem;
  font-weight: bold;
}
.card-text {
  font-size: 0.9rem;
  color: #6c757d;
}
.text-primary {
  color: #007bff !important;
}
</style>
