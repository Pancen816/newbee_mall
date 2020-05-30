package ltd.newbee.mall.dao;

import ltd.newbee.mall.entity.AdminUser;
import org.apache.ibatis.annotations.Param;

public interface AdminUserMapper {
    /**
     * 添加管理员
     * @param record
     * @return
     */
    int insert(AdminUser record);


    int insertSelective(AdminUser record);

    /**
     * 登录方法
     * @param userName
     * @param password
     * @return
     */
    AdminUser login(@Param("userName") String userName, @Param("password") String password);

    /**
     * 通过主键（adminUserId）查找
     * @param adminUserId
     * @return
     */
    AdminUser selectByPrimaryKey(Integer adminUserId);


    int updateByPrimaryKeySelective(AdminUser record);

    /**
     * 指定用户（adminUserId）信息修改
     * @param record
     * @return
     */
    int updateByPrimaryKey(AdminUser record);
}