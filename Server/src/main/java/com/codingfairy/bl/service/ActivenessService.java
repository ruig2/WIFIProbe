package com.codingfairy.bl.service;

import com.codingfairy.utils.enums.QueryThreshold;

import java.util.List;
import java.util.Map;

/**
 * Created by cuihao on 2017-05-16.
 * Customer activeness service
 */
public interface ActivenessService {

    List<Map> getActivenessStat(int startHour, QueryThreshold threshold, int startRange, String probeId);
}
