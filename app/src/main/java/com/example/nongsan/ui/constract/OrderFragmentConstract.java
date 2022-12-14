package com.example.nongsan.ui.constract;

import com.example.nongsan.data.dao.model.OrderDetail;

import java.util.List;

public interface OrderFragmentConstract {
    interface IView{
        void setOrderDetailListToView(List<OrderDetail> orderDetailList);
    }

    interface IPresenter{
        void setView(IView view);
        void getOrderDetailList();
    }
}
