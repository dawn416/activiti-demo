/**
 * Copyright(C) 2019 Zhejiang Fline Technology Co., Ltd. All rights reserved.
 */
package cn.guolf.activiti;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.ExecutionListener;
import org.activiti.engine.delegate.JavaDelegate;

/**
 * 
 * @since 2019年10月26日 下午9:59:57
 */
public class EndTaskListener implements ExecutionListener, JavaDelegate {

    @Override
    public void notify(DelegateExecution execution) throws Exception {
        System.out.println(execution.getTenantId());
    }

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        System.out.println(execution.getCurrentActivityId());

    }

}
