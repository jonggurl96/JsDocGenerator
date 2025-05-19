# JsDocGenerator

> Javascript Document Generator
> 
> **From.**
> 
> ```java
> @Getter
> @Setter
> public class People {
> 
>   /**
>    * People name
>    */
>   private String name;
> 
>   /**
>    * People age
>    */
>   private int age;
> 
>   /**
>    * People hobbys
>    */
>   private List<String> hobbys;
> }
> ```
>
> **To.**
> 
> ```javascript
> /**
>  * @typedef {Object} People
>  * @property {string} name People name
>  * @property {number} age People age
>  * @property {string[]} hobbys People hobbys
>  */
> ```



