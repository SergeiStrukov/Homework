package org._2024_06_14.taskiMick;

import Old.org._2024_06_14.taskiMick.OrderRepository;
import Old.org._2024_06_14.taskiMick.OrderService;
import Old.org._2024_06_14.taskiMick.PurchaseOrder;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class OrderServiceTest {
    //    Задача 2: Написание тестов с использованием Mockito
//    Цель:
//    Создать модульные тесты для системы управления заказами,
//    используя библиотеку Mockito для мокирования зависимостей.
//
//    Описание задачи:
//    Разработать тесты для классов:
//
//    OrderService: проверка корректности работы методов placeOrder и getOrder.
//    Функциональные требования:
//
//    Использовать аннотацию @Mock для создания моков OrderRepository.
//    Использовать аннотацию @InjectMocks для создания экземпляра OrderService, в который будут инжектироваться моки OrderRepository.
//    Написать тест для метода placeOrder, проверяющий, что метод save у OrderRepository вызывается с правильным заказом.
//    Написать тест для метода getOrder, проверяющий, что метод findById у OrderRepository вызывается с правильным идентификатором, и что возвращается корректный заказ.
//    Нефункциональные требования:
//
//    Код тестов должен быть написан на языке Java.
//    Использовать библиотеку Mockito для мокирования зависимостей.
//    Тесты должны быть написаны с использованием фреймворка JUnit 5.
    @Mock
    private PurchaseOrder order;
    @Mock
    private OrderRepository orderRepository;
    @InjectMocks
    private OrderService orderService;

    @Test
    void placeOrder() {
        orderService.placeOrder(order);
        orderService.placeOrder(order);

        // Assert
        verify(orderRepository, times(2)).save(order);
    }

    @Test
    void getOrder() {
        when(orderRepository.findById(order.getId())).thenReturn(order);

    }
}