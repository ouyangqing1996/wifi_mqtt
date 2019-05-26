package com.zhupp.ems.util.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andEmsUserInfoIdIsNull() {
            addCriterion("ems_user_info_id is null");
            return (Criteria) this;
        }

        public Criteria andEmsUserInfoIdIsNotNull() {
            addCriterion("ems_user_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmsUserInfoIdEqualTo(Long value) {
            addCriterion("ems_user_info_id =", value, "emsUserInfoId");
            return (Criteria) this;
        }

        public Criteria andEmsUserInfoIdNotEqualTo(Long value) {
            addCriterion("ems_user_info_id <>", value, "emsUserInfoId");
            return (Criteria) this;
        }

        public Criteria andEmsUserInfoIdGreaterThan(Long value) {
            addCriterion("ems_user_info_id >", value, "emsUserInfoId");
            return (Criteria) this;
        }

        public Criteria andEmsUserInfoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ems_user_info_id >=", value, "emsUserInfoId");
            return (Criteria) this;
        }

        public Criteria andEmsUserInfoIdLessThan(Long value) {
            addCriterion("ems_user_info_id <", value, "emsUserInfoId");
            return (Criteria) this;
        }

        public Criteria andEmsUserInfoIdLessThanOrEqualTo(Long value) {
            addCriterion("ems_user_info_id <=", value, "emsUserInfoId");
            return (Criteria) this;
        }

        public Criteria andEmsUserInfoIdIn(List<Long> values) {
            addCriterion("ems_user_info_id in", values, "emsUserInfoId");
            return (Criteria) this;
        }

        public Criteria andEmsUserInfoIdNotIn(List<Long> values) {
            addCriterion("ems_user_info_id not in", values, "emsUserInfoId");
            return (Criteria) this;
        }

        public Criteria andEmsUserInfoIdBetween(Long value1, Long value2) {
            addCriterion("ems_user_info_id between", value1, value2, "emsUserInfoId");
            return (Criteria) this;
        }

        public Criteria andEmsUserInfoIdNotBetween(Long value1, Long value2) {
            addCriterion("ems_user_info_id not between", value1, value2, "emsUserInfoId");
            return (Criteria) this;
        }

        public Criteria andEmsUserIdIsNull() {
            addCriterion("ems_user_id is null");
            return (Criteria) this;
        }

        public Criteria andEmsUserIdIsNotNull() {
            addCriterion("ems_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmsUserIdEqualTo(String value) {
            addCriterion("ems_user_id =", value, "emsUserId");
            return (Criteria) this;
        }

        public Criteria andEmsUserIdNotEqualTo(String value) {
            addCriterion("ems_user_id <>", value, "emsUserId");
            return (Criteria) this;
        }

        public Criteria andEmsUserIdGreaterThan(String value) {
            addCriterion("ems_user_id >", value, "emsUserId");
            return (Criteria) this;
        }

        public Criteria andEmsUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("ems_user_id >=", value, "emsUserId");
            return (Criteria) this;
        }

        public Criteria andEmsUserIdLessThan(String value) {
            addCriterion("ems_user_id <", value, "emsUserId");
            return (Criteria) this;
        }

        public Criteria andEmsUserIdLessThanOrEqualTo(String value) {
            addCriterion("ems_user_id <=", value, "emsUserId");
            return (Criteria) this;
        }

        public Criteria andEmsUserIdLike(String value) {
            addCriterion("ems_user_id like", value, "emsUserId");
            return (Criteria) this;
        }

        public Criteria andEmsUserIdNotLike(String value) {
            addCriterion("ems_user_id not like", value, "emsUserId");
            return (Criteria) this;
        }

        public Criteria andEmsUserIdIn(List<String> values) {
            addCriterion("ems_user_id in", values, "emsUserId");
            return (Criteria) this;
        }

        public Criteria andEmsUserIdNotIn(List<String> values) {
            addCriterion("ems_user_id not in", values, "emsUserId");
            return (Criteria) this;
        }

        public Criteria andEmsUserIdBetween(String value1, String value2) {
            addCriterion("ems_user_id between", value1, value2, "emsUserId");
            return (Criteria) this;
        }

        public Criteria andEmsUserIdNotBetween(String value1, String value2) {
            addCriterion("ems_user_id not between", value1, value2, "emsUserId");
            return (Criteria) this;
        }

        public Criteria andEmsUserPasswordIsNull() {
            addCriterion("ems_user_password is null");
            return (Criteria) this;
        }

        public Criteria andEmsUserPasswordIsNotNull() {
            addCriterion("ems_user_password is not null");
            return (Criteria) this;
        }

        public Criteria andEmsUserPasswordEqualTo(String value) {
            addCriterion("ems_user_password =", value, "emsUserPassword");
            return (Criteria) this;
        }

        public Criteria andEmsUserPasswordNotEqualTo(String value) {
            addCriterion("ems_user_password <>", value, "emsUserPassword");
            return (Criteria) this;
        }

        public Criteria andEmsUserPasswordGreaterThan(String value) {
            addCriterion("ems_user_password >", value, "emsUserPassword");
            return (Criteria) this;
        }

        public Criteria andEmsUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("ems_user_password >=", value, "emsUserPassword");
            return (Criteria) this;
        }

        public Criteria andEmsUserPasswordLessThan(String value) {
            addCriterion("ems_user_password <", value, "emsUserPassword");
            return (Criteria) this;
        }

        public Criteria andEmsUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("ems_user_password <=", value, "emsUserPassword");
            return (Criteria) this;
        }

        public Criteria andEmsUserPasswordLike(String value) {
            addCriterion("ems_user_password like", value, "emsUserPassword");
            return (Criteria) this;
        }

        public Criteria andEmsUserPasswordNotLike(String value) {
            addCriterion("ems_user_password not like", value, "emsUserPassword");
            return (Criteria) this;
        }

        public Criteria andEmsUserPasswordIn(List<String> values) {
            addCriterion("ems_user_password in", values, "emsUserPassword");
            return (Criteria) this;
        }

        public Criteria andEmsUserPasswordNotIn(List<String> values) {
            addCriterion("ems_user_password not in", values, "emsUserPassword");
            return (Criteria) this;
        }

        public Criteria andEmsUserPasswordBetween(String value1, String value2) {
            addCriterion("ems_user_password between", value1, value2, "emsUserPassword");
            return (Criteria) this;
        }

        public Criteria andEmsUserPasswordNotBetween(String value1, String value2) {
            addCriterion("ems_user_password not between", value1, value2, "emsUserPassword");
            return (Criteria) this;
        }

        public Criteria andEmsUserStatusIsNull() {
            addCriterion("ems_user_status is null");
            return (Criteria) this;
        }

        public Criteria andEmsUserStatusIsNotNull() {
            addCriterion("ems_user_status is not null");
            return (Criteria) this;
        }

        public Criteria andEmsUserStatusEqualTo(String value) {
            addCriterion("ems_user_status =", value, "emsUserStatus");
            return (Criteria) this;
        }

        public Criteria andEmsUserStatusNotEqualTo(String value) {
            addCriterion("ems_user_status <>", value, "emsUserStatus");
            return (Criteria) this;
        }

        public Criteria andEmsUserStatusGreaterThan(String value) {
            addCriterion("ems_user_status >", value, "emsUserStatus");
            return (Criteria) this;
        }

        public Criteria andEmsUserStatusGreaterThanOrEqualTo(String value) {
            addCriterion("ems_user_status >=", value, "emsUserStatus");
            return (Criteria) this;
        }

        public Criteria andEmsUserStatusLessThan(String value) {
            addCriterion("ems_user_status <", value, "emsUserStatus");
            return (Criteria) this;
        }

        public Criteria andEmsUserStatusLessThanOrEqualTo(String value) {
            addCriterion("ems_user_status <=", value, "emsUserStatus");
            return (Criteria) this;
        }

        public Criteria andEmsUserStatusLike(String value) {
            addCriterion("ems_user_status like", value, "emsUserStatus");
            return (Criteria) this;
        }

        public Criteria andEmsUserStatusNotLike(String value) {
            addCriterion("ems_user_status not like", value, "emsUserStatus");
            return (Criteria) this;
        }

        public Criteria andEmsUserStatusIn(List<String> values) {
            addCriterion("ems_user_status in", values, "emsUserStatus");
            return (Criteria) this;
        }

        public Criteria andEmsUserStatusNotIn(List<String> values) {
            addCriterion("ems_user_status not in", values, "emsUserStatus");
            return (Criteria) this;
        }

        public Criteria andEmsUserStatusBetween(String value1, String value2) {
            addCriterion("ems_user_status between", value1, value2, "emsUserStatus");
            return (Criteria) this;
        }

        public Criteria andEmsUserStatusNotBetween(String value1, String value2) {
            addCriterion("ems_user_status not between", value1, value2, "emsUserStatus");
            return (Criteria) this;
        }

        public Criteria andEmsUserCreateTimeIsNull() {
            addCriterion("ems_user_create_time is null");
            return (Criteria) this;
        }

        public Criteria andEmsUserCreateTimeIsNotNull() {
            addCriterion("ems_user_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andEmsUserCreateTimeEqualTo(Date value) {
            addCriterion("ems_user_create_time =", value, "emsUserCreateTime");
            return (Criteria) this;
        }

        public Criteria andEmsUserCreateTimeNotEqualTo(Date value) {
            addCriterion("ems_user_create_time <>", value, "emsUserCreateTime");
            return (Criteria) this;
        }

        public Criteria andEmsUserCreateTimeGreaterThan(Date value) {
            addCriterion("ems_user_create_time >", value, "emsUserCreateTime");
            return (Criteria) this;
        }

        public Criteria andEmsUserCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ems_user_create_time >=", value, "emsUserCreateTime");
            return (Criteria) this;
        }

        public Criteria andEmsUserCreateTimeLessThan(Date value) {
            addCriterion("ems_user_create_time <", value, "emsUserCreateTime");
            return (Criteria) this;
        }

        public Criteria andEmsUserCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("ems_user_create_time <=", value, "emsUserCreateTime");
            return (Criteria) this;
        }

        public Criteria andEmsUserCreateTimeIn(List<Date> values) {
            addCriterion("ems_user_create_time in", values, "emsUserCreateTime");
            return (Criteria) this;
        }

        public Criteria andEmsUserCreateTimeNotIn(List<Date> values) {
            addCriterion("ems_user_create_time not in", values, "emsUserCreateTime");
            return (Criteria) this;
        }

        public Criteria andEmsUserCreateTimeBetween(Date value1, Date value2) {
            addCriterion("ems_user_create_time between", value1, value2, "emsUserCreateTime");
            return (Criteria) this;
        }

        public Criteria andEmsUserCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("ems_user_create_time not between", value1, value2, "emsUserCreateTime");
            return (Criteria) this;
        }

        public Criteria andEmsUserUpdateTimeIsNull() {
            addCriterion("ems_user_update_time is null");
            return (Criteria) this;
        }

        public Criteria andEmsUserUpdateTimeIsNotNull() {
            addCriterion("ems_user_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andEmsUserUpdateTimeEqualTo(Date value) {
            addCriterion("ems_user_update_time =", value, "emsUserUpdateTime");
            return (Criteria) this;
        }

        public Criteria andEmsUserUpdateTimeNotEqualTo(Date value) {
            addCriterion("ems_user_update_time <>", value, "emsUserUpdateTime");
            return (Criteria) this;
        }

        public Criteria andEmsUserUpdateTimeGreaterThan(Date value) {
            addCriterion("ems_user_update_time >", value, "emsUserUpdateTime");
            return (Criteria) this;
        }

        public Criteria andEmsUserUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ems_user_update_time >=", value, "emsUserUpdateTime");
            return (Criteria) this;
        }

        public Criteria andEmsUserUpdateTimeLessThan(Date value) {
            addCriterion("ems_user_update_time <", value, "emsUserUpdateTime");
            return (Criteria) this;
        }

        public Criteria andEmsUserUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("ems_user_update_time <=", value, "emsUserUpdateTime");
            return (Criteria) this;
        }

        public Criteria andEmsUserUpdateTimeIn(List<Date> values) {
            addCriterion("ems_user_update_time in", values, "emsUserUpdateTime");
            return (Criteria) this;
        }

        public Criteria andEmsUserUpdateTimeNotIn(List<Date> values) {
            addCriterion("ems_user_update_time not in", values, "emsUserUpdateTime");
            return (Criteria) this;
        }

        public Criteria andEmsUserUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("ems_user_update_time between", value1, value2, "emsUserUpdateTime");
            return (Criteria) this;
        }

        public Criteria andEmsUserUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("ems_user_update_time not between", value1, value2, "emsUserUpdateTime");
            return (Criteria) this;
        }

        public Criteria andEmsUserNameIsNull() {
            addCriterion("ems_user_name is null");
            return (Criteria) this;
        }

        public Criteria andEmsUserNameIsNotNull() {
            addCriterion("ems_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andEmsUserNameEqualTo(String value) {
            addCriterion("ems_user_name =", value, "emsUserName");
            return (Criteria) this;
        }

        public Criteria andEmsUserNameNotEqualTo(String value) {
            addCriterion("ems_user_name <>", value, "emsUserName");
            return (Criteria) this;
        }

        public Criteria andEmsUserNameGreaterThan(String value) {
            addCriterion("ems_user_name >", value, "emsUserName");
            return (Criteria) this;
        }

        public Criteria andEmsUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("ems_user_name >=", value, "emsUserName");
            return (Criteria) this;
        }

        public Criteria andEmsUserNameLessThan(String value) {
            addCriterion("ems_user_name <", value, "emsUserName");
            return (Criteria) this;
        }

        public Criteria andEmsUserNameLessThanOrEqualTo(String value) {
            addCriterion("ems_user_name <=", value, "emsUserName");
            return (Criteria) this;
        }

        public Criteria andEmsUserNameLike(String value) {
            addCriterion("ems_user_name like", value, "emsUserName");
            return (Criteria) this;
        }

        public Criteria andEmsUserNameNotLike(String value) {
            addCriterion("ems_user_name not like", value, "emsUserName");
            return (Criteria) this;
        }

        public Criteria andEmsUserNameIn(List<String> values) {
            addCriterion("ems_user_name in", values, "emsUserName");
            return (Criteria) this;
        }

        public Criteria andEmsUserNameNotIn(List<String> values) {
            addCriterion("ems_user_name not in", values, "emsUserName");
            return (Criteria) this;
        }

        public Criteria andEmsUserNameBetween(String value1, String value2) {
            addCriterion("ems_user_name between", value1, value2, "emsUserName");
            return (Criteria) this;
        }

        public Criteria andEmsUserNameNotBetween(String value1, String value2) {
            addCriterion("ems_user_name not between", value1, value2, "emsUserName");
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