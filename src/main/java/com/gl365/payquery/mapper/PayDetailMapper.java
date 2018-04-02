package com.gl365.payquery.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.gl365.payquery.model.PayDetail;
@Repository
public interface PayDetailMapper{
	List<PayDetail> queryPayDetailByPayId(@Param("payId") String payId);
}