package com.zhupp.ems.util.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeviceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andEmsDeviceInfoIdIsNull() {
            addCriterion("ems_device_info_id is null");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceInfoIdIsNotNull() {
            addCriterion("ems_device_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceInfoIdEqualTo(Long value) {
            addCriterion("ems_device_info_id =", value, "emsDeviceInfoId");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceInfoIdNotEqualTo(Long value) {
            addCriterion("ems_device_info_id <>", value, "emsDeviceInfoId");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceInfoIdGreaterThan(Long value) {
            addCriterion("ems_device_info_id >", value, "emsDeviceInfoId");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceInfoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ems_device_info_id >=", value, "emsDeviceInfoId");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceInfoIdLessThan(Long value) {
            addCriterion("ems_device_info_id <", value, "emsDeviceInfoId");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceInfoIdLessThanOrEqualTo(Long value) {
            addCriterion("ems_device_info_id <=", value, "emsDeviceInfoId");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceInfoIdIn(List<Long> values) {
            addCriterion("ems_device_info_id in", values, "emsDeviceInfoId");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceInfoIdNotIn(List<Long> values) {
            addCriterion("ems_device_info_id not in", values, "emsDeviceInfoId");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceInfoIdBetween(Long value1, Long value2) {
            addCriterion("ems_device_info_id between", value1, value2, "emsDeviceInfoId");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceInfoIdNotBetween(Long value1, Long value2) {
            addCriterion("ems_device_info_id not between", value1, value2, "emsDeviceInfoId");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceUserIdIsNull() {
            addCriterion("ems_device_user_id is null");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceUserIdIsNotNull() {
            addCriterion("ems_device_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceUserIdEqualTo(String value) {
            addCriterion("ems_device_user_id =", value, "emsDeviceUserId");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceUserIdNotEqualTo(String value) {
            addCriterion("ems_device_user_id <>", value, "emsDeviceUserId");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceUserIdGreaterThan(String value) {
            addCriterion("ems_device_user_id >", value, "emsDeviceUserId");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("ems_device_user_id >=", value, "emsDeviceUserId");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceUserIdLessThan(String value) {
            addCriterion("ems_device_user_id <", value, "emsDeviceUserId");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceUserIdLessThanOrEqualTo(String value) {
            addCriterion("ems_device_user_id <=", value, "emsDeviceUserId");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceUserIdLike(String value) {
            addCriterion("ems_device_user_id like", value, "emsDeviceUserId");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceUserIdNotLike(String value) {
            addCriterion("ems_device_user_id not like", value, "emsDeviceUserId");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceUserIdIn(List<String> values) {
            addCriterion("ems_device_user_id in", values, "emsDeviceUserId");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceUserIdNotIn(List<String> values) {
            addCriterion("ems_device_user_id not in", values, "emsDeviceUserId");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceUserIdBetween(String value1, String value2) {
            addCriterion("ems_device_user_id between", value1, value2, "emsDeviceUserId");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceUserIdNotBetween(String value1, String value2) {
            addCriterion("ems_device_user_id not between", value1, value2, "emsDeviceUserId");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceStatusIsNull() {
            addCriterion("ems_device_status is null");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceStatusIsNotNull() {
            addCriterion("ems_device_status is not null");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceStatusEqualTo(String value) {
            addCriterion("ems_device_status =", value, "emsDeviceStatus");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceStatusNotEqualTo(String value) {
            addCriterion("ems_device_status <>", value, "emsDeviceStatus");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceStatusGreaterThan(String value) {
            addCriterion("ems_device_status >", value, "emsDeviceStatus");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceStatusGreaterThanOrEqualTo(String value) {
            addCriterion("ems_device_status >=", value, "emsDeviceStatus");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceStatusLessThan(String value) {
            addCriterion("ems_device_status <", value, "emsDeviceStatus");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceStatusLessThanOrEqualTo(String value) {
            addCriterion("ems_device_status <=", value, "emsDeviceStatus");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceStatusLike(String value) {
            addCriterion("ems_device_status like", value, "emsDeviceStatus");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceStatusNotLike(String value) {
            addCriterion("ems_device_status not like", value, "emsDeviceStatus");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceStatusIn(List<String> values) {
            addCriterion("ems_device_status in", values, "emsDeviceStatus");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceStatusNotIn(List<String> values) {
            addCriterion("ems_device_status not in", values, "emsDeviceStatus");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceStatusBetween(String value1, String value2) {
            addCriterion("ems_device_status between", value1, value2, "emsDeviceStatus");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceStatusNotBetween(String value1, String value2) {
            addCriterion("ems_device_status not between", value1, value2, "emsDeviceStatus");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceCreateTimeIsNull() {
            addCriterion("ems_device_create_time is null");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceCreateTimeIsNotNull() {
            addCriterion("ems_device_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceCreateTimeEqualTo(Date value) {
            addCriterion("ems_device_create_time =", value, "emsDeviceCreateTime");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceCreateTimeNotEqualTo(Date value) {
            addCriterion("ems_device_create_time <>", value, "emsDeviceCreateTime");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceCreateTimeGreaterThan(Date value) {
            addCriterion("ems_device_create_time >", value, "emsDeviceCreateTime");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ems_device_create_time >=", value, "emsDeviceCreateTime");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceCreateTimeLessThan(Date value) {
            addCriterion("ems_device_create_time <", value, "emsDeviceCreateTime");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("ems_device_create_time <=", value, "emsDeviceCreateTime");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceCreateTimeIn(List<Date> values) {
            addCriterion("ems_device_create_time in", values, "emsDeviceCreateTime");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceCreateTimeNotIn(List<Date> values) {
            addCriterion("ems_device_create_time not in", values, "emsDeviceCreateTime");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceCreateTimeBetween(Date value1, Date value2) {
            addCriterion("ems_device_create_time between", value1, value2, "emsDeviceCreateTime");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("ems_device_create_time not between", value1, value2, "emsDeviceCreateTime");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceUpdateTimeIsNull() {
            addCriterion("ems_device_update_time is null");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceUpdateTimeIsNotNull() {
            addCriterion("ems_device_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceUpdateTimeEqualTo(Date value) {
            addCriterion("ems_device_update_time =", value, "emsDeviceUpdateTime");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceUpdateTimeNotEqualTo(Date value) {
            addCriterion("ems_device_update_time <>", value, "emsDeviceUpdateTime");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceUpdateTimeGreaterThan(Date value) {
            addCriterion("ems_device_update_time >", value, "emsDeviceUpdateTime");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ems_device_update_time >=", value, "emsDeviceUpdateTime");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceUpdateTimeLessThan(Date value) {
            addCriterion("ems_device_update_time <", value, "emsDeviceUpdateTime");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("ems_device_update_time <=", value, "emsDeviceUpdateTime");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceUpdateTimeIn(List<Date> values) {
            addCriterion("ems_device_update_time in", values, "emsDeviceUpdateTime");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceUpdateTimeNotIn(List<Date> values) {
            addCriterion("ems_device_update_time not in", values, "emsDeviceUpdateTime");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("ems_device_update_time between", value1, value2, "emsDeviceUpdateTime");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("ems_device_update_time not between", value1, value2, "emsDeviceUpdateTime");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceAddressIsNull() {
            addCriterion("ems_device_address is null");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceAddressIsNotNull() {
            addCriterion("ems_device_address is not null");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceAddressEqualTo(String value) {
            addCriterion("ems_device_address =", value, "emsDeviceAddress");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceAddressNotEqualTo(String value) {
            addCriterion("ems_device_address <>", value, "emsDeviceAddress");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceAddressGreaterThan(String value) {
            addCriterion("ems_device_address >", value, "emsDeviceAddress");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ems_device_address >=", value, "emsDeviceAddress");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceAddressLessThan(String value) {
            addCriterion("ems_device_address <", value, "emsDeviceAddress");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceAddressLessThanOrEqualTo(String value) {
            addCriterion("ems_device_address <=", value, "emsDeviceAddress");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceAddressLike(String value) {
            addCriterion("ems_device_address like", value, "emsDeviceAddress");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceAddressNotLike(String value) {
            addCriterion("ems_device_address not like", value, "emsDeviceAddress");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceAddressIn(List<String> values) {
            addCriterion("ems_device_address in", values, "emsDeviceAddress");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceAddressNotIn(List<String> values) {
            addCriterion("ems_device_address not in", values, "emsDeviceAddress");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceAddressBetween(String value1, String value2) {
            addCriterion("ems_device_address between", value1, value2, "emsDeviceAddress");
            return (Criteria) this;
        }

        public Criteria andEmsDeviceAddressNotBetween(String value1, String value2) {
            addCriterion("ems_device_address not between", value1, value2, "emsDeviceAddress");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}