package shop.mtcoding.product.model.user;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import shop.mtcoding.product.dto.user.RequestDto.JoinReqDto;
import shop.mtcoding.product.dto.user.RequestDto.LoginReqDto;

@Mapper
public interface UserRepository {
    public void insert(JoinReqDto joinReqDto);

    public User findById(Integer usersId);

    public List<User> findAll();

    public void update(User user);

    public void delete(Integer usersId);

    public User login(LoginReqDto loginReqDto);
}