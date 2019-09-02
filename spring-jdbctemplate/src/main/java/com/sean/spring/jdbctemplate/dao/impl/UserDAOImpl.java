package com.sean.spring.jdbctemplate.dao.impl;

import com.sean.spring.jdbctemplate.dao.IUserDAO;
import com.sean.spring.jdbctemplate.entity.User;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * UserDAO接口实现类
 *
 * @author xiaoh
 * @date 2019/9/2
 */
public class UserDAOImpl extends JdbcDaoSupport implements IUserDAO {
    @Override
    public void addUser(User user) {
        String sql = "insert into user(name, icon, sex, birthday, status, register_ts) values (?, ?, ?, ?, ?, ?)";
        this.getJdbcTemplate().update(sql, user.getName(), user.getIcon(), user.getSex(), user.getBirthday(),
            user.getStatus(), user.getRegisterTs());
    }

    @Override
    public void deleteUser(int id) {
        String sql = "delete from user where id = ?";
        this.getJdbcTemplate().update(sql, id);
    }

    @Override
    public void updateUser(User user) {
        String sql = "update user set name=?, icon=?, sex=?, birthday=?, status=?, register_ts=? where id=?";
        this.getJdbcTemplate().update(sql, user.getName(), user.getIcon(), user.getSex(), user.getBirthday(),
                user.getStatus(), user.getRegisterTs(), user.getId());
    }

    @Override
    public User searchUser(int id) {
        String sql = "select * from user where id = ?";
        return this.getJdbcTemplate().queryForObject(sql, new UserRowMapper(), id);
    }

    @Override
    public List<User> findAll() {
        String sql = "select * from user";
        return this.getJdbcTemplate().query(sql, new UserRowMapper());
    }

    class UserRowMapper implements RowMapper<User> {
        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
            User user = new User();
            user.setId(rs.getInt("id"));
            user.setName(rs.getString("name"));
            user.setIcon(rs.getString("icon"));
            user.setSex(rs.getInt("sex"));
            user.setBirthday(rs.getString("birthday"));
            user.setStatus(rs.getInt("status"));
            user.setRegisterTs(rs.getInt("register_ts"));
            return user;
        }
    }
}
