package ii_collections

import ii_collections.data.orderedProducts
import v_builders.data.getProducts

fun example() {

    val result = listOf("abc", "12").flatMap { it.toList() }

    result == listOf('a', 'b', 'c', '1', '2')
}

val Customer.orderedProducts: Set<Product> get() {
    // Return all products ordered by customer
    // todoCollectionTask()
    return orders.flatMap { it.products }.toSet()
}

val Shop.allOrderedProducts: Set<Product> get() {
    // Return all products that were ordered by at least one customer
    //todoCollectionTask()
    return customers.flatMap { it.orderedProducts }.toSet()
}
