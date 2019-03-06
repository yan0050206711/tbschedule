package com.tstd2.tbschedule;

import com.taobao.pamirs.schedule.IScheduleTaskDealSingle;
import com.taobao.pamirs.schedule.TaskItemDefine;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 示例一:演示tbs基本配置与单机调用
 *
 * 示例用交易凭证对象，我们用它来演示各类场景运算。
 * @author wed
 * @since 2017-12-18
 */
@Component("firstScheduleDemo")
public class FirstScheduleDemo implements IScheduleTaskDealSingle<TransactionVoucher> {
    /**
     * 数据加工方法，处理来自selectTasks()返回的数据
     * @param transactionVoucher 凭证对象
     * @param owenSign 隔离作用域
     * @return 是否处理成功
     * @throws Exception
     */
    @Override
    public boolean execute(TransactionVoucher transactionVoucher, String owenSign) throws Exception {
        //数据加工开始，这里只是简单的输出数据内容
        System.out.println(ToStringBuilder.reflectionToString(transactionVoucher));
        //数据处理结束，返回成功或失败
        return true;
    }

    @Override
    public List<TransactionVoucher> selectTasks(String taskParameter, String ownSign, int taskItemNum, List<TaskItemDefine> taskItemList, int eachFetchDataNum) throws Exception {
        //模拟生成一条交易凭证
        final TransactionVoucher tmp = new TransactionVoucher();
        tmp.setId(1L);
        tmp.setDirection(0);
        tmp.setAdmount(100L);
        return new ArrayList<TransactionVoucher>(){
            private static final long serialVersionUID = -1772752676884292373L;
            {
            add(tmp);
        }};
    }

    /**
     * getComparator()让用户自定义生成两个task之间的比较方法，避免重复的task执行。
     * 有需要的朋友自行实现该方法，并可在selectTask()方法返回前去除重复数据，本系列
     * 教程不对该方法多做讲解
     *
     * @return 自定义比较器
     */
    @Override
    public Comparator<TransactionVoucher> getComparator() {
        return null;
    }
}

