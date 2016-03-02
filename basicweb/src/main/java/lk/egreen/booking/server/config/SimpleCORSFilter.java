package lk.egreen.booking.server.config;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * Created by dew on 2/29/16.
 */
@Component
public class SimpleCORSFilter extends org.springframework.web.filter.DelegatingFilterProxy implements Filter{



    @Override
    public void doFilter(ServletRequest req, ServletResponse resp,
                         FilterChain chain) throws IOException, ServletException {
        // TODO Auto-generated method stub
//
//        super.doFilter(req,resp,chain);
//        System.out.println(req.getContentType());
//        System.out.println(slurp(req.getInputStream(),1024));
        HttpServletResponse response=(HttpServletResponse) resp;

        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "*");
        response.setHeader("Accept", "application/json");

        chain.doFilter(req, resp);
    }

    @Override
    public void destroy() {}



    public static String slurp(final InputStream is, final int bufferSize) {
        final char[] buffer = new char[bufferSize];
        final StringBuilder out = new StringBuilder();
        try (Reader in = new InputStreamReader(is, "UTF-8")) {
            for (;;) {
                int rsz = in.read(buffer, 0, buffer.length);
                if (rsz < 0)
                    break;
                out.append(buffer, 0, rsz);
            }
        }
        catch (UnsupportedEncodingException ex) {
        /* ... */
        }
        catch (IOException ex) {
        /* ... */
        }
        return out.toString();
    }
}