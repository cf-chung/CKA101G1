package com.freemind.coupons.model;

import java.util.List;


public interface CouponDAO_interface {
	public void insert(CouponVO couponsVO);
    public void update(CouponVO couponsVO);
    public void delete(Integer coupon_id);
    public CouponVO findByPrimaryKey(Integer coupon_id);
    public List<CouponVO> getAll();
    //萬用複合查詢(傳入參數型態Map)(回傳 List)
//  public List<EmpVO> getAll(Map<String, String[]> map);
	
	
}
