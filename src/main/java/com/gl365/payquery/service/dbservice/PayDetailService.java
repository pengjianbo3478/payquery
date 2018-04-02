package com.gl365.payquery.service.dbservice;
import java.util.List;
import com.gl365.payquery.model.PayDetail;
public interface PayDetailService {
	
	List<PayDetail> queryPayDetailByPayId( String payId);
}
