/**
 *
 */
package com.mybatis3.mappers;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.mybatis3.domain.Address;
import org.springframework.stereotype.Repository;

/**
 * @author Siva
 */

@Repository
public interface AddressMapper {
    @Select("select addr_id as addrId, street, city, state, zip, country from addresses where addr_id=#{id}")
    Address selectAddressById(int id);

    @Insert("insert into addresses(street, city, state, zip, country) values(#{street},#{city},#{state},#{zip},#{country})")
    int insertAddress(Address address);
}
