package com.zhupp.ems.util.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataExample() {
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

        public Criteria andEmsDataInfoIdIsNull() {
            addCriterion("ems_data_info_id is null");
            return (Criteria) this;
        }

        public Criteria andEmsDataInfoIdIsNotNull() {
            addCriterion("ems_data_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmsDataInfoIdEqualTo(Long value) {
            addCriterion("ems_data_info_id =", value, "emsDataInfoId");
            return (Criteria) this;
        }

        public Criteria andEmsDataInfoIdNotEqualTo(Long value) {
            addCriterion("ems_data_info_id <>", value, "emsDataInfoId");
            return (Criteria) this;
        }

        public Criteria andEmsDataInfoIdGreaterThan(Long value) {
            addCriterion("ems_data_info_id >", value, "emsDataInfoId");
            return (Criteria) this;
        }

        public Criteria andEmsDataInfoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ems_data_info_id >=", value, "emsDataInfoId");
            return (Criteria) this;
        }

        public Criteria andEmsDataInfoIdLessThan(Long value) {
            addCriterion("ems_data_info_id <", value, "emsDataInfoId");
            return (Criteria) this;
        }

        public Criteria andEmsDataInfoIdLessThanOrEqualTo(Long value) {
            addCriterion("ems_data_info_id <=", value, "emsDataInfoId");
            return (Criteria) this;
        }

        public Criteria andEmsDataInfoIdIn(List<Long> values) {
            addCriterion("ems_data_info_id in", values, "emsDataInfoId");
            return (Criteria) this;
        }

        public Criteria andEmsDataInfoIdNotIn(List<Long> values) {
            addCriterion("ems_data_info_id not in", values, "emsDataInfoId");
            return (Criteria) this;
        }

        public Criteria andEmsDataInfoIdBetween(Long value1, Long value2) {
            addCriterion("ems_data_info_id between", value1, value2, "emsDataInfoId");
            return (Criteria) this;
        }

        public Criteria andEmsDataInfoIdNotBetween(Long value1, Long value2) {
            addCriterion("ems_data_info_id not between", value1, value2, "emsDataInfoId");
            return (Criteria) this;
        }

        public Criteria andEmsDataMessageIsNull() {
            addCriterion("ems_data_message is null");
            return (Criteria) this;
        }

        public Criteria andEmsDataMessageIsNotNull() {
            addCriterion("ems_data_message is not null");
            return (Criteria) this;
        }

        public Criteria andEmsDataMessageEqualTo(String value) {
            addCriterion("ems_data_message =", value, "emsDataMessage");
            return (Criteria) this;
        }

        public Criteria andEmsDataMessageNotEqualTo(String value) {
            addCriterion("ems_data_message <>", value, "emsDataMessage");
            return (Criteria) this;
        }

        public Criteria andEmsDataMessageGreaterThan(String value) {
            addCriterion("ems_data_message >", value, "emsDataMessage");
            return (Criteria) this;
        }

        public Criteria andEmsDataMessageGreaterThanOrEqualTo(String value) {
            addCriterion("ems_data_message >=", value, "emsDataMessage");
            return (Criteria) this;
        }

        public Criteria andEmsDataMessageLessThan(String value) {
            addCriterion("ems_data_message <", value, "emsDataMessage");
            return (Criteria) this;
        }

        public Criteria andEmsDataMessageLessThanOrEqualTo(String value) {
            addCriterion("ems_data_message <=", value, "emsDataMessage");
            return (Criteria) this;
        }

        public Criteria andEmsDataMessageLike(String value) {
            addCriterion("ems_data_message like", value, "emsDataMessage");
            return (Criteria) this;
        }

        public Criteria andEmsDataMessageNotLike(String value) {
            addCriterion("ems_data_message not like", value, "emsDataMessage");
            return (Criteria) this;
        }

        public Criteria andEmsDataMessageIn(List<String> values) {
            addCriterion("ems_data_message in", values, "emsDataMessage");
            return (Criteria) this;
        }

        public Criteria andEmsDataMessageNotIn(List<String> values) {
            addCriterion("ems_data_message not in", values, "emsDataMessage");
            return (Criteria) this;
        }

        public Criteria andEmsDataMessageBetween(String value1, String value2) {
            addCriterion("ems_data_message between", value1, value2, "emsDataMessage");
            return (Criteria) this;
        }

        public Criteria andEmsDataMessageNotBetween(String value1, String value2) {
            addCriterion("ems_data_message not between", value1, value2, "emsDataMessage");
            return (Criteria) this;
        }

        public Criteria andEmsDataMessageTypeIsNull() {
            addCriterion("ems_data_message_type is null");
            return (Criteria) this;
        }

        public Criteria andEmsDataMessageTypeIsNotNull() {
            addCriterion("ems_data_message_type is not null");
            return (Criteria) this;
        }

        public Criteria andEmsDataMessageTypeEqualTo(String value) {
            addCriterion("ems_data_message_type =", value, "emsDataMessageType");
            return (Criteria) this;
        }

        public Criteria andEmsDataMessageTypeNotEqualTo(String value) {
            addCriterion("ems_data_message_type <>", value, "emsDataMessageType");
            return (Criteria) this;
        }

        public Criteria andEmsDataMessageTypeGreaterThan(String value) {
            addCriterion("ems_data_message_type >", value, "emsDataMessageType");
            return (Criteria) this;
        }

        public Criteria andEmsDataMessageTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ems_data_message_type >=", value, "emsDataMessageType");
            return (Criteria) this;
        }

        public Criteria andEmsDataMessageTypeLessThan(String value) {
            addCriterion("ems_data_message_type <", value, "emsDataMessageType");
            return (Criteria) this;
        }

        public Criteria andEmsDataMessageTypeLessThanOrEqualTo(String value) {
            addCriterion("ems_data_message_type <=", value, "emsDataMessageType");
            return (Criteria) this;
        }

        public Criteria andEmsDataMessageTypeLike(String value) {
            addCriterion("ems_data_message_type like", value, "emsDataMessageType");
            return (Criteria) this;
        }

        public Criteria andEmsDataMessageTypeNotLike(String value) {
            addCriterion("ems_data_message_type not like", value, "emsDataMessageType");
            return (Criteria) this;
        }

        public Criteria andEmsDataMessageTypeIn(List<String> values) {
            addCriterion("ems_data_message_type in", values, "emsDataMessageType");
            return (Criteria) this;
        }

        public Criteria andEmsDataMessageTypeNotIn(List<String> values) {
            addCriterion("ems_data_message_type not in", values, "emsDataMessageType");
            return (Criteria) this;
        }

        public Criteria andEmsDataMessageTypeBetween(String value1, String value2) {
            addCriterion("ems_data_message_type between", value1, value2, "emsDataMessageType");
            return (Criteria) this;
        }

        public Criteria andEmsDataMessageTypeNotBetween(String value1, String value2) {
            addCriterion("ems_data_message_type not between", value1, value2, "emsDataMessageType");
            return (Criteria) this;
        }

        public Criteria andEmsDataCreateTimeIsNull() {
            addCriterion("ems_data_create_time is null");
            return (Criteria) this;
        }

        public Criteria andEmsDataCreateTimeIsNotNull() {
            addCriterion("ems_data_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andEmsDataCreateTimeEqualTo(Date value) {
            addCriterion("ems_data_create_time =", value, "emsDataCreateTime");
            return (Criteria) this;
        }

        public Criteria andEmsDataCreateTimeNotEqualTo(Date value) {
            addCriterion("ems_data_create_time <>", value, "emsDataCreateTime");
            return (Criteria) this;
        }

        public Criteria andEmsDataCreateTimeGreaterThan(Date value) {
            addCriterion("ems_data_create_time >", value, "emsDataCreateTime");
            return (Criteria) this;
        }

        public Criteria andEmsDataCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ems_data_create_time >=", value, "emsDataCreateTime");
            return (Criteria) this;
        }

        public Criteria andEmsDataCreateTimeLessThan(Date value) {
            addCriterion("ems_data_create_time <", value, "emsDataCreateTime");
            return (Criteria) this;
        }

        public Criteria andEmsDataCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("ems_data_create_time <=", value, "emsDataCreateTime");
            return (Criteria) this;
        }

        public Criteria andEmsDataCreateTimeIn(List<Date> values) {
            addCriterion("ems_data_create_time in", values, "emsDataCreateTime");
            return (Criteria) this;
        }

        public Criteria andEmsDataCreateTimeNotIn(List<Date> values) {
            addCriterion("ems_data_create_time not in", values, "emsDataCreateTime");
            return (Criteria) this;
        }

        public Criteria andEmsDataCreateTimeBetween(Date value1, Date value2) {
            addCriterion("ems_data_create_time between", value1, value2, "emsDataCreateTime");
            return (Criteria) this;
        }

        public Criteria andEmsDataCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("ems_data_create_time not between", value1, value2, "emsDataCreateTime");
            return (Criteria) this;
        }

        public Criteria andEmsDataDeviceIdIsNull() {
            addCriterion("ems_data_device_id is null");
            return (Criteria) this;
        }

        public Criteria andEmsDataDeviceIdIsNotNull() {
            addCriterion("ems_data_device_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmsDataDeviceIdEqualTo(String value) {
            addCriterion("ems_data_device_id =", value, "emsDataDeviceId");
            return (Criteria) this;
        }

        public Criteria andEmsDataDeviceIdNotEqualTo(String value) {
            addCriterion("ems_data_device_id <>", value, "emsDataDeviceId");
            return (Criteria) this;
        }

        public Criteria andEmsDataDeviceIdGreaterThan(String value) {
            addCriterion("ems_data_device_id >", value, "emsDataDeviceId");
            return (Criteria) this;
        }

        public Criteria andEmsDataDeviceIdGreaterThanOrEqualTo(String value) {
            addCriterion("ems_data_device_id >=", value, "emsDataDeviceId");
            return (Criteria) this;
        }

        public Criteria andEmsDataDeviceIdLessThan(String value) {
            addCriterion("ems_data_device_id <", value, "emsDataDeviceId");
            return (Criteria) this;
        }

        public Criteria andEmsDataDeviceIdLessThanOrEqualTo(String value) {
            addCriterion("ems_data_device_id <=", value, "emsDataDeviceId");
            return (Criteria) this;
        }

        public Criteria andEmsDataDeviceIdLike(String value) {
            addCriterion("ems_data_device_id like", value, "emsDataDeviceId");
            return (Criteria) this;
        }

        public Criteria andEmsDataDeviceIdNotLike(String value) {
            addCriterion("ems_data_device_id not like", value, "emsDataDeviceId");
            return (Criteria) this;
        }

        public Criteria andEmsDataDeviceIdIn(List<String> values) {
            addCriterion("ems_data_device_id in", values, "emsDataDeviceId");
            return (Criteria) this;
        }

        public Criteria andEmsDataDeviceIdNotIn(List<String> values) {
            addCriterion("ems_data_device_id not in", values, "emsDataDeviceId");
            return (Criteria) this;
        }

        public Criteria andEmsDataDeviceIdBetween(String value1, String value2) {
            addCriterion("ems_data_device_id between", value1, value2, "emsDataDeviceId");
            return (Criteria) this;
        }

        public Criteria andEmsDataDeviceIdNotBetween(String value1, String value2) {
            addCriterion("ems_data_device_id not between", value1, value2, "emsDataDeviceId");
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