
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import MemberManagementCustomerManager from "./components/listers/MemberManagementCustomerCards"
import MemberManagementCustomerDetail from "./components/listers/MemberManagementCustomerDetail"

import ProductManagementProductManager from "./components/listers/ProductManagementProductCards"
import ProductManagementProductDetail from "./components/listers/ProductManagementProductDetail"

import OrderProcessingOrderManager from "./components/listers/OrderProcessingOrderCards"
import OrderProcessingOrderDetail from "./components/listers/OrderProcessingOrderDetail"

import SupplierManagementSupplierManager from "./components/listers/SupplierManagementSupplierCards"
import SupplierManagementSupplierDetail from "./components/listers/SupplierManagementSupplierDetail"

import DeliveryServiceDeliveryManager from "./components/listers/DeliveryServiceDeliveryCards"
import DeliveryServiceDeliveryDetail from "./components/listers/DeliveryServiceDeliveryDetail"

import CouponCouponManager from "./components/listers/CouponCouponCards"
import CouponCouponDetail from "./components/listers/CouponCouponDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/memberManagements/customers',
                name: 'MemberManagementCustomerManager',
                component: MemberManagementCustomerManager
            },
            {
                path: '/memberManagements/customers/:id',
                name: 'MemberManagementCustomerDetail',
                component: MemberManagementCustomerDetail
            },

            {
                path: '/productManagements/products',
                name: 'ProductManagementProductManager',
                component: ProductManagementProductManager
            },
            {
                path: '/productManagements/products/:id',
                name: 'ProductManagementProductDetail',
                component: ProductManagementProductDetail
            },

            {
                path: '/orderProcessings/orders',
                name: 'OrderProcessingOrderManager',
                component: OrderProcessingOrderManager
            },
            {
                path: '/orderProcessings/orders/:id',
                name: 'OrderProcessingOrderDetail',
                component: OrderProcessingOrderDetail
            },

            {
                path: '/supplierManagements/suppliers',
                name: 'SupplierManagementSupplierManager',
                component: SupplierManagementSupplierManager
            },
            {
                path: '/supplierManagements/suppliers/:id',
                name: 'SupplierManagementSupplierDetail',
                component: SupplierManagementSupplierDetail
            },

            {
                path: '/deliveryServices/deliveries',
                name: 'DeliveryServiceDeliveryManager',
                component: DeliveryServiceDeliveryManager
            },
            {
                path: '/deliveryServices/deliveries/:id',
                name: 'DeliveryServiceDeliveryDetail',
                component: DeliveryServiceDeliveryDetail
            },

            {
                path: '/coupons/coupons',
                name: 'CouponCouponManager',
                component: CouponCouponManager
            },
            {
                path: '/coupons/coupons/:id',
                name: 'CouponCouponDetail',
                component: CouponCouponDetail
            },



    ]
})
