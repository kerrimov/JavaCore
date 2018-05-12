import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Date;

@WebFilter("/*")
public class MyFilter implements Filter {
    private FilterConfig filterConfig= null;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;

        String servletPath = req.getServletPath();



        filterChain.doFilter(request, response);

        System.out.println("#INFO " + new Date() + " - ServletPath :" + servletPath
                + ", URL =" + req.getRequestURL());
    }

    @Override
    public void destroy() {
        System.out.println("MyFilter destroy");
    }
}
