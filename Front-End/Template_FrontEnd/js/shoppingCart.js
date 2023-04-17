//cart=[
//      {product:{id:1, name: 'sp1', colorId:1, colorName:'Đen', price: 232}, quantity}
//]
// $(document).ready(function() {
    let cart = [];
    var product = {};
    var total = 0;
    window.onload = function() {
        loadTotalProduct();
        // localStorage.removeItem('cart');
    };
function addToCart(productId, colorId, price) {
   
  let storage = localStorage.getItem("cart");
  if (storage) {
    cart = JSON.parse(storage);
  }
  product = {
    productId: productId,

    colorId: colorId,

    price: price,
  };

  console.log(product);
  //http://localhost:9090/product/findDetailProduct?id=3&color=3
  //   $.ajax({
  //     type: "GET",
  //     url:
  //       "http://localhost:9090/product/findDetailProduct?id=" +
  //       productId +
  //       "&color=" +
  //       colorId,
  //     dataType: "json",
  //     success: function (result) {
  //       // product=result;
  //       product = result;
  //     },
  //     error: function (xhr, status, error) {
  //       console.log("Error find Product");
  //     },
  //   });

  let item = cart.find(
    (c) => c.product.productId == productId && c.product.colorId == colorId
  );
  if (item) {
    item.quantity += 1;
  } else {
    cart.push({ product, quantity: 1 });
  }
  localStorage.setItem("cart", JSON.stringify(cart));
  loadTotalProduct();
}
function loadTotalProduct(){
    var cart=JSON.parse(localStorage.getItem("cart"));
    if(cart!=null){
        var t=0;
        cart.forEach(e => {
            t+=e.quantity;
        });
        document.getElementById("product-count").innerHTML=t;
    }
    else{
        document.getElementById("product-count").innerHTML=0;
    }
}
function showCart() {
    var cartBody=document.getElementById("cartBody");
    cartBody.innerHTML='';
    let storage = localStorage.getItem("cart");
  if (storage) {
    cart = JSON.parse(storage);
  }
   cart.map(item => {
    cartBody.innerHTML+=`
            <tr class="cart_item">
                <td class="product-remove">
                    <a title="Remove this item" class="remove" href="#">×</a>
                </td>
            
                <td class="product-name">
                    <a href="single-product.html">${item.product.productId}</a>
                </td>
                <td class="product-name">
                    <span>${item.product.colorId}</span>
                </td>
            
                <td class="product-price">
                    <span class="amount">${numberWithCommas(item.product.price)}</span> VNĐ
                </td>
            
                <td class="product-quantity">
                    <div class="quantity buttons_added">
                        <input type="button" class="minus button-c" value="-"
                            onclick="subtract()">
            
                        <input type="number" size="4" class="input-text qty text"
                            style="text-align: center;" title="Qty" value="${item.quantity}" min="1"
                            step="1" id="numberInputProduct" onchange="subtract()">
            
                        <input type="button" class="plus button-c" value="+"
                            onclick="add()">
                    </div>
                </td>
            
                <td class="product-subtotal">
                    <span class="amount">${numberWithCommas(parseInt(item.product.price*item.quantity))}</span> VNĐ
                </td>
        </tr>`;
   })
   document.getElementById("cartBody").innerHTML+=`<tr>
    <td class="actions" colspan="6">
      <input
        type="submit"
        value="Thanh Toán"
        name="proceed"
        class="checkout-button button alt wc-forward button-c"
      />
    </td>
  </tr>`;
}
 // format price
 function numberWithCommas(x) {
    return x.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",");
  }
// })
