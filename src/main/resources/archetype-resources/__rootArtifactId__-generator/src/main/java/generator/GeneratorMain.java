package ${package}.generator;


import ${package}.generator.core.CodeGenerator;
import ${package}.generator.core.DataSource;
import ${package}.generator.core.Module;

/**
 * Created by hocgin on 2020/5/29.
 * email: hocgin@gmail.com
 *
 * @author hocgin
 */
public class GeneratorMain {

    public static void main(String[] args) {
        //
        CodeGenerator.generateByTables(DataSource.DEFAULT,
            Module.TPL, false,
            "",
            "");
    }

}
