package ${package}.api.named;

import in.hocg.boot.named.annotation.NamedService;
import in.hocg.boot.named.ifc.NamedArgs;
import in.hocg.boot.named.ifc.NamedHandler;
import ${package}.api.${suffixClass}ServiceName;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

/**
 * Created by hocgin on 2021/12/10
 * email: hocgin@gmail.com
 *
 * @author hocgin
 */
@FeignClient(value = ${suffixClass}ServiceName.NAME)
public interface ${suffixClass}NamedServiceApi extends NamedService {
    String CONTEXT_ID = "${suffixClass}NamedServiceApi";


    @NamedHandler(${suffixClass}NamedType.DataDictName)
    @PostMapping(value = CONTEXT_ID + "/loadByDataDictName", headers = ${suffixClass}ServiceName.FEIGN_HEADER)
    Map<String, Object> loadByDataDictName(@RequestBody NamedArgs args);
}
