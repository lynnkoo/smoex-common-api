package com.smoex.common.mapper;

import com.smoex.common.base.BaseMapper;
import com.smoex.common.base.BaseQuery;
import com.smoex.common.entity.UserEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<UserEntity> {

    UserEntity selectByWhere(BaseQuery query);
}
