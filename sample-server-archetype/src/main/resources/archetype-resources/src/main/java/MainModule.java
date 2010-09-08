#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};        
import com.google.inject.Binder;
import com.google.inject.Module;

public class MainModule
        implements Module
{
    public void configure(Binder binder)
    {
        binder.bind(HelloResource.class);
    }
}