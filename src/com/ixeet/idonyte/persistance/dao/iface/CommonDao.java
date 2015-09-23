package com.ixeet.idonyte.persistance.dao.iface;

import java.util.List;

import com.ixeet.idonyte.domain.exception.AppDaoException;
import com.ixeet.idonyte.domain.vo.CommonKeyValueVO;

public interface CommonDao {
	
	List<CommonKeyValueVO> getStateList() throws AppDaoException;
	List<CommonKeyValueVO> getDistrictList(int stateId) throws AppDaoException;
	List<CommonKeyValueVO> getAreaList(int districtId) throws AppDaoException;

}
