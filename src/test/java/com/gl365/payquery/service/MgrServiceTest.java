package com.gl365.payquery.service;
import static org.junit.Assert.assertNotNull;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.gl365.payquery.dto.mgr.request.QueryPagePayMainReqDTO;
import com.gl365.payquery.dto.mgr.request.QueryPagePayReturnReqDTO;
import com.gl365.payquery.dto.mgr.request.QueryPagePayTotalByOperatorDetailReqDTO;
import com.gl365.payquery.dto.mgr.request.QueryPagePayTotalByOperatorReqDTO;
import com.gl365.payquery.dto.mgr.request.QueryPayDetailByPayIdReqDTO;
import com.gl365.payquery.dto.mgr.request.QueryPayMainByPayIdReqDTO;
import com.gl365.payquery.dto.mgr.request.QueryPayMainGroupPayReqDTO;
import com.gl365.payquery.dto.mgr.request.QueryPayReturnByPayIdReqDTO;
import com.gl365.payquery.dto.mgr.response.QueryPagePayMainRespDTO;
import com.gl365.payquery.dto.mgr.response.QueryPagePayReturnRespDTO;
import com.gl365.payquery.dto.mgr.response.QueryPagePayTotalByOperatorDetailRespDTO;
import com.gl365.payquery.dto.mgr.response.QueryPagePayTotalByOperatorRespDTO;
import com.gl365.payquery.dto.mgr.response.QueryPayDetailByPayIdRespDTO;
import com.gl365.payquery.dto.mgr.response.QueryPayMainByPayIdRespDTO;
import com.gl365.payquery.dto.mgr.response.QueryPayMainGroupPayRespDTO;
import com.gl365.payquery.dto.mgr.response.QueryPayReturnByPayIdRespDTO;
import com.gl365.payquery.enums.pay.SceneCategory;
import com.gl365.payquery.enums.system.DateFormatStyle;
import com.gl365.payquery.model.PayReturn;
import com.gl365.payquery.service.mgr.MgrService;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@MapperScan(basePackages = { "com.gl365.payquery.mapper" })
@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.gl365.payquery.*" })
@EnableFeignClients
public class MgrServiceTest {
	private static final Logger LOG = LoggerFactory.getLogger(MgrServiceTest.class);
	@Autowired
	private MgrService mgrService;

	@Test
	@Ignore
	public void testQueryPayMainByPayId() {
		QueryPayMainByPayIdReqDTO request = new QueryPayMainByPayIdReqDTO();
		request.setPayId("80170712012824BXFD");
		QueryPayMainByPayIdRespDTO result = this.mgrService.queryPayMainByPayId(request);
		assertNotNull(result);
		LOG.debug("result={}", result);
	}

	@Test
	public void testQueryPagePayMain() {
		QueryPagePayMainReqDTO request = new QueryPagePayMainReqDTO();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DateFormatStyle.FULL.getValue());
		request.setStartDate(LocalDateTime.parse("2017-07-10 00:00:00", formatter));
		request.setEndDate(LocalDateTime.now());
		request.setMerchantNo("1000001900003");
		request.setSceneCategory(SceneCategory.WX.getCode());
		QueryPagePayMainRespDTO result = this.mgrService.queryPagePayMain(request);
		LOG.debug("result={}", result);
	}

	@Test
	@Ignore
	public void testQueryPayReturnByPayId() {
		QueryPayReturnByPayIdReqDTO request = new QueryPayReturnByPayIdReqDTO();
		request.setPayId("85170623114884S22C");
		QueryPayReturnByPayIdRespDTO result = this.mgrService.queryPayReturnByPayId(request);
		assertNotNull(result);
		LOG.debug("result={}", result);
	}

	@Test
	@Ignore
	public void testQueryPagePayReturn() {
		QueryPagePayReturnReqDTO request = new QueryPagePayReturnReqDTO();
		request.setOrganCode("10003");
		QueryPagePayReturnRespDTO result = this.mgrService.queryPagePayReturn(request);
		List<PayReturn> list = result.getResultData().getList();
		LOG.debug("list size={}", list.size());
		LOG.debug("resultDataTotal={}", result.getResultDataTotal());
	}

	@Test
	@Ignore
	public void testQueryPayDetailByPayId() {
		QueryPayDetailByPayIdReqDTO request = new QueryPayDetailByPayIdReqDTO();
		request.setPayId("80170712232855HVUO");
		QueryPayDetailByPayIdRespDTO result = this.mgrService.queryPayDetailByPayId(request);
		assertNotNull(result);
		LOG.debug("result={}", result);
	}

	@Test
	@Ignore
	public void testQueryPayMainGroupPay() {
		QueryPayMainGroupPayReqDTO request = new QueryPayMainGroupPayReqDTO();
		request.setGroupOrderId("879879874698");
		request.setUserId("52ecaa6c3bb545aea27429a6de3c6d46");
		QueryPayMainGroupPayRespDTO result = this.mgrService.queryPayMainGroupPay(request);
		assertNotNull(result);
		LOG.debug("result={}", result);
	}

	@Test
	@Ignore
	public void testQueryPagePayTotalByOperator() {
		QueryPagePayTotalByOperatorReqDTO request = new QueryPagePayTotalByOperatorReqDTO();
		request.setMerchantNo("1000001900343");
		DateTimeFormatter df = DateTimeFormatter.ofPattern(DateFormatStyle.FULL.getValue());
		request.setPayStartDate(LocalDateTime.parse("2017-07-10 00:00:00", df));
		request.setPayEndDate(LocalDateTime.now());
		QueryPagePayTotalByOperatorRespDTO result = this.mgrService.queryPagePayTotalByOperator(request);
		assertNotNull(result);
		LOG.debug("result={}", result);
	}

	@Test
	@Ignore
	public void testQueryPagePayTotalByOperatorDetail() {
		QueryPagePayTotalByOperatorDetailReqDTO request = new QueryPagePayTotalByOperatorDetailReqDTO();
		request.setMerchantNo("1000001900343");
		request.setOperator("a40509da88df454f9c64f1378b92dca6");
		DateTimeFormatter df = DateTimeFormatter.ofPattern(DateFormatStyle.FULL.getValue());
		request.setPayStartDate(LocalDateTime.parse("2017-07-10 00:00:00", df));
		request.setPayEndDate(LocalDateTime.now());
		QueryPagePayTotalByOperatorDetailRespDTO result = this.mgrService.queryPagePayTotalByOperatorDetail(request);
		LOG.debug("result={}", result);
	}
}
