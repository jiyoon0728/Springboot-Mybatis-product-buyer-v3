package shop.mtcoding.product.model.user;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import shop.mtcoding.product.dto.user.RequestDto.JoinReqDto;
import shop.mtcoding.product.dto.user.RequestDto.LoginReqDto;

@Mapper
public interface UserRepository {
    public User login(LoginReqDto loginReqDto); 

    public List<User> findAll(); 

    public User findById(int id);

    public int insert(JoinReqDto joinReqDto);

    public int delete(@Param("id") int id);

    public int update(@Param("username") String username, @Param("password") String password, @Param("email") String email);
}