$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/Cucumber/Features/buy-product.feature");
formatter.feature({
  "line": 1,
  "name": "Buying product Hummingbird Printed Sweater",
  "description": "",
  "id": "buying-product-hummingbird-printed-sweater",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Add product to cart and finish buying procedure",
  "description": "",
  "id": "buying-product-hummingbird-printed-sweater;add-product-to-cart-and-finish-buying-procedure",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User logged in CodersLab shop",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Chose product - Hummingbird Printed Sweater with discount",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Chose size M and quantity",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Added product to cart",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Went to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Confirmed address",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Chose PrestaShop shipping method - pick up in store",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Pay by check and clicked order with an obligation to pay",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Created Screenshot with conformation of order and price",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Customer sees info \"YOUR ORDER IS CONFIRMED\"",
  "keyword": "Then "
});
formatter.match({
  "location": "BuyProductSteps.userLoggedInCodersLabShop()"
});
formatter.result({
  "duration": 7170570517,
  "status": "passed"
});
formatter.match({
  "location": "BuyProductSteps.choseProductHummingbirdPrintedSweaterWithDiscount()"
});
formatter.result({
  "duration": 1420414476,
  "status": "passed"
});
formatter.match({
  "location": "BuyProductSteps.choseSizeMAndQuantity()"
});
formatter.result({
  "duration": 262233734,
  "status": "passed"
});
formatter.match({
  "location": "BuyProductSteps.addedProductToCart()"
});
formatter.result({
  "duration": 86323756,
  "status": "passed"
});
formatter.match({
  "location": "BuyProductSteps.wentToCheckout()"
});
formatter.result({
  "duration": 2022636204,
  "status": "passed"
});
formatter.match({
  "location": "BuyProductSteps.confirmedAddress()"
});
formatter.result({
  "duration": 812385279,
  "status": "passed"
});
formatter.match({
  "location": "BuyProductSteps.chosePrestaShopShippingMethodPickUpInStore()"
});
formatter.result({
  "duration": 842977296,
  "status": "passed"
});
formatter.match({
  "location": "BuyProductSteps.clickedOrderWithAnObligationToPay()"
});
formatter.result({
  "duration": 2025078746,
  "status": "passed"
});
formatter.match({
  "location": "BuyProductSteps.createdScreenshotWithConformationOfOrderAndPrice()"
});
formatter.result({
  "duration": 541824969,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "YOUR ORDER IS CONFIRMED",
      "offset": 20
    }
  ],
  "location": "BuyProductSteps.customerSeesInfo(String)"
});
formatter.result({
  "duration": 29518542,
  "status": "passed"
});
});