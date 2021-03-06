package com.bird.gateway.common.dto.convert;

import com.bird.gateway.common.GatewayConstant;
import lombok.Getter;
import lombok.Setter;

/**
 * @author liuxx
 * @date 2018/11/29
 */
@Getter
@Setter
public class HystrixHandle {
    /**
     * hystrix group key is required.
     */
    private String groupKey;

    /**
     * hystrix command key is required.
     */
    private String commandKey;

    /**
     * hystrix withExecutionIsolationSemaphoreMaxConcurrentRequests.
     */
    private int maxConcurrentRequests = GatewayConstant.MAX_CONCURRENT_REQUESTS;

    /**
     * hystrix withCircuitBreakerErrorThresholdPercentage.
     */
    private int errorThresholdPercentage = GatewayConstant.ERROR_THRESHOLD_PERCENTAGE;

    /**
     * hystrix withCircuitBreakerRequestVolumeThreshold.
     */
    private int requestVolumeThreshold = GatewayConstant.REQUEST_VOLUME_THRESHOLD;

    /**
     * hystrix withCircuitBreakerSleepWindowInMilliseconds.
     */
    private int sleepWindowInMilliseconds = GatewayConstant.SLEEP_WINDOW_INMILLISECONDS;

    /**
     * timeout is required.
     */
    private Integer timeout = GatewayConstant.TIME_OUT;
}
