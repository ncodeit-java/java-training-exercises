package com.ncodeit.spingbootrest.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class AppInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request,
	HttpServletResponse response, Object object) throws Exception {
		String token=request.getHeader("token");
		if(ObjectUtils.isEmpty(token)) {
			return false;
		}
		return true;
	}
	

}
