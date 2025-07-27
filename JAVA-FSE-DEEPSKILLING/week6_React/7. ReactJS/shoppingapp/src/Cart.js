import React, { Component } from "react";

class Cart extends Component {
  render() {
    return (
      <div>
        <h3>
          Item Name: {this.props.itemname} | Price: ₹{this.props.price}
        </h3>
      </div>
    );
  }
}

export default Cart;
