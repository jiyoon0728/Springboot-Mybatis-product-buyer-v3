package shop.mtcoding.product.model.orders;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrdersRepository {

    public void insert(Orders orders);

    public Orders findById(Integer ordersId);

    public List<Orders> findAll(Integer usersId);

    public void orderUpdatebyProductQty(Orders orders);

    public void delete(Integer ordersId);
}