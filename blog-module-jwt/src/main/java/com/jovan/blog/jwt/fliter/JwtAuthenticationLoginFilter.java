package com.jovan.blog.jwt.fliter;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jovan.blog.jwt.exception.UsernameOrPasswordNullException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

/**
 * @author: Jovan
 * @date: 2024/12/10
 * @description:
 */
@Slf4j
public class JwtAuthenticationLoginFilter extends AbstractAuthenticationProcessingFilter {

    /**
     * 设置登录认证的访问地址
     */
    public JwtAuthenticationLoginFilter() {
        super(new AntPathRequestMatcher("/login", "POST"));
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException, IOException, ServletException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = mapper.readTree(request.getInputStream());
        String username = jsonNode.get("username").textValue();
        String password = jsonNode.get("password").textValue();

        log.info("==> 用户尝试登录认证，username: {}, password: {}", username, password);

        // 将用户名、密码封装到 Token 中
        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken
                = new UsernamePasswordAuthenticationToken(username, password);
        return getAuthenticationManager().authenticate(usernamePasswordAuthenticationToken);
    }
}