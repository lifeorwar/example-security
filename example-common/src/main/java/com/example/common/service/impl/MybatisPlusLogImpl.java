package com.example.common.service.impl;

import com.example.common.util.AnsiUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.logging.Log;
import org.fusesource.jansi.Ansi;

import static com.example.common.constant.SqlLogConstant.*;

/**
 * Mybatis Plus 日志输出实现类
 *
 * @author yuanzili/lifeorwar@gmail.com
 * @version V1.0.0
 * @date 2019/8/23 10:53
 */
@Slf4j
public class MybatisPlusLogImpl implements Log {

    public MybatisPlusLogImpl(String clazz) {
    }

    @Override
    public boolean isDebugEnabled() {
        return true;
    }

    @Override
    public boolean isTraceEnabled() {
        return true;
    }

    @Override
    public void error(String s, Throwable e) {
        System.err.println(s);
        e.printStackTrace(System.err);
    }

    @Override
    public void error(String s) {
        log.error("error ==>> {}", s);
    }

    @Override
    public void debug(String s) {
        if (s.contains(PREPARING) || s.contains(PARAMETERS) || s.contains(TOTAL)) {
            s = s.replaceAll(REGEX_ONE, "").trim();
            s = s.replaceAll(REGEX_TWO, "").trim();
            log.info(AnsiUtil.getAnsi(Ansi.Color.YELLOW, s));
        }
    }

    @Override
    public void trace(String s) {
        if (s.contains(ROW)) {
            s = s.replaceAll(REGEX_TWO, "").trim();
            log.info(AnsiUtil.getAnsi(Ansi.Color.YELLOW, s));
        }
    }

    @Override
    public void warn(String s) {
        log.warn("warn ==>> {}", s);
    }
}
