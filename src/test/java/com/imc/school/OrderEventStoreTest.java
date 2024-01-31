package com.imc.school;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.function.Predicate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

class OrderEventStoreTest {
    private OrderEventStore theSubject;

    @BeforeEach
    void setUp() {
        theSubject = new OrderEventStore();
    }

    @Test
    void event1OrderIdsAreAllValid() {
        // EXAMPLE: Assertj has some great support for working with collections.
        // E.g., you can extract data from each element and apply predicates on them.
        // Predicate has good support for composition.
        assertThat(theSubject.getEvent(1).orders())
                .extracting(OrderInfo::orderId)
                .allMatch(Predicate.not(String::isEmpty));
    }

    @Test
    void event1OrdersAreSentOnTheCorrectBook() {
        // TODO: Ensure the book is "RDSA" in the following assertion.

        // assertThat(theSubject.getEvent(1)).extracting(Orders::book) /* Fill me in */);
        fail("This test needs to be implemented.");
    }

    @Test
    void event1ExpectedPrices() {
        // The collection based Assertj assertions are better than testing individual elements in a for loop as they
        // express the intent of the testing better and produce better error messages that provide context. E.g. Using
        // contains...InAnyOrder() vs contains...() informs the developer whether the order matters or not.

        // TODO: use assertThat to extract a field and contains...() to ensure
        // that the prices are 1.23, 1.24, 1.25 in this order.
        // Matching doubles is not as trivial as matching ints. Take that into account.
        // Hint: you can specify an element comparator.

        fail("This test needs to be implemented.");
    }

    @Test
    void event1AllOrdersAreBuySide() {
        // TODO: You should be able to work this one out from the test name.

        fail("This test needs to be implemented.");
    }

    @Test
    void event1OrderIdsStartWithEventDash1() {
        // TODO: Ensure that all order ids for event 1 start with the text "event1-"
        // assertThat(theSubject.getEvent(1).orders()) /* Fill me in */;

        fail("This test needs to be implemented.");
    }

    @Test
    void event1ExpectedOrders() {
        // TODO: Write a *single* assertThat statement that verifies the following orders.
        //  The expected orders (the order does not matter):
        //   Price | Volume
        //   1.23  | 100
        //   1.24  | 200
        //   1.25  | 300
        // Note: You are allowed to use only one extracting() and one contains...().
        fail("This test needs to be implemented.");
    }

    @Test
    void event2OrdersAreEmpty() {
        // TODO: Use the *most* appropriate and readable assertion to ensure the collection is empty.
        // Note: Don't use `...size()).isEqualTo(0)`. You can do better than that.
        // assertThat(theSubject.getEvent(2).orders()) /* Fill me in */

        fail("This test needs to be implemented.");
    }

    @Test
    void unknownEventIdThrows() {
        // TODO: Find an appropriate assertion to ensure an exception of type IllegalArgumentException
        // with the message "Event not received: 999" is thrown when the event 999 does not exist.
        // Use `theSubject.getEvent(999)`

        fail("This test needs to be implemented.");
    }
}