package Annotation;

/**
 * 元注解:对现有的注解进行解释说明的注解
 *  Retention:指定所修饰的Annotation的生命周期: SOURCE\CLASS （默认行为） \RUNTIME
 *      只有声明为RUNTIME生命周期的注解，才能通过反射获取。
 *  Target:用于指定被修饰的Annotation能用于修饰哪些程序元素
 * *******出现的频率较低*******
 *  Documented:表示所修饰的注解在被javadoc解析时，保留下来。
 *  Inherited:被它修饰的Annotation将具有继承性。
 *
 * 5.通过反射获取注解信息一一 到反射内容时系统讲解
 * 6. jdk 8中注解的新特性:可重复注解、类型注解
 *
 *   6.1 可重复注解:①在MyAnnotation.上声明@Repeatable， 成员值为MyAnnotations.class
 *                  ②MyAnnotation 的Target和Retention MyAnnotations相同。
 *  6.2类型注解:
 * ElementType. TYPE_ _PARAMETER 表示该注解能写在类型变量的声明语句中（如:泛型声明）。
 * ElementType. TYPE_ USE表示该注解能写在使用类型的任何语句中。
 */
public @interface AnnotationTest {
}
