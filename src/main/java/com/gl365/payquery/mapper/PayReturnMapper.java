package com.gl365.payquery.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.gl365.payquery.dto.mgr.response.QueryPagePayReturnTotalRespDTO;
import com.gl365.payquery.model.PayReturn;
@Repository
public interface PayReturnMapper {

	List<PayReturn> queryPagePayReturn(PayReturn payReturn);

	PayReturn queryByPayId(@Param("payId") String payId);

	QueryPagePayReturnTotalRespDTO queryPagePayReturnTotal(PayReturn payReturn);
}