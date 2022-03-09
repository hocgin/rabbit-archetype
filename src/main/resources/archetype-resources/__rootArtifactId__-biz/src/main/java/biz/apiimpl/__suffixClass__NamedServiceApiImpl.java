package ${package}.biz.apiimpl;

import in.hocg.boot.named.autoconfiguration.core.AbsNamedServiceExpand;
import in.hocg.boot.named.ifc.NamedArgs;
import in.hocg.boot.utils.DataDictUtils;
import ${package}.api.${suffixClass}ServiceName;
import ${package}.api.named.${suffixClass}NamedServiceApi;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

/**
 * Created by hocgin on 2021/12/10
 * email: hocgin@gmail.com
 *
 * @author hocgin
 */
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Lazy))
public class ${suffixClass}NamedServiceApiImpl extends AbsNamedServiceExpand
    implements ${suffixClass}NamedServiceApi {

    @Override
    public Map<String, Object> loadByDataDictName(NamedArgs args) {
        String key = args.getArgs()[0];
        return DataDictUtils.scanMaps(${suffixClass}ServiceName.PACKAGE).getOrDefault(key, Collections.emptyMap());
    }
}
