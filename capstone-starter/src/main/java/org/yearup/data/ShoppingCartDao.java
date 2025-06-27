package org.yearup.data;

import org.yearup.models.ShoppingCart;


import java.sql.SQLException;

public interface ShoppingCartDao
{
    ShoppingCart getByUserId(int userId);
    // add additional method signatures here

void addProduct(int userID, int productId, int quantity) throws SQLException;

void removeProduct(int userID, int productID);

void clearCart(int userId);

void updateQuantity(int userId, int productId, int quantity);

void checkout(int userId);

}
