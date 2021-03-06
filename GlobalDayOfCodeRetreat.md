#Global Day Of Code Retreat

##主题

重复的做一个简单的任务，[“Conway's Game Of Life”] [GameOfLife]。

全天共有六个session，每个session包含40分钟左右，以及一个或者多个的限制。每个session的目的不在于完成，目的仅仅是实践。

其余更多介绍可以参考InfoQ上[Global Day Of Code Retreat] [GlobalDayOfCodeRetreat]的介绍。

##活动
早上9点开始，上午3个session，而后午休+交流。下午3个session，6点结束。

*每次活动2人pair，必须找一个不同的人。*

**session结束后将本次代码封存/删除。**

###session 1
**constraint: 没有限制，用任意喜好的语言，实现这个小功能**

这个session的主要目的是了解整个任务是神马，要实现的大体功能是神马。

这里也简单介绍一下，这是一个0-player的游戏，给定输入，就看着这个世界如何演进就OK了。

总体在描述一个世界，有一群孤独又怕挤的神奇的小细胞们，生存条件如下:

* 活细胞周围的活细胞个数小于2个时，下一次演进会死去
* 活细胞周围的活细胞个数大于3个时，下一次演进会死去
* 活细胞周围的活细胞个数等于2/3个时，下一次演进会活着
* 死细胞周围的活细胞个数等于3个时，下一次会复活

*总的来说，周围活细胞个数为3时，该细胞活着。个数为2个时，活细胞依然活着。其余情况，细胞死去。*

没写完。

###session 2
**constraint: 使用TDD开发**

该环节要求每一行代码嵌入前，必须有相关失败的用例驱使，包括类的新建，方法的新建，逻辑的新建/更新等等。

这时基本上已经熟悉了整体功能，从用例开始写起也还算顺手。

设计就是一个叫做Block的世界初始化，打印，加上一个叫做LifeScanner的神来决定每个细胞下一次的死活。

结束的时候依然没写完。

###session 3
**constraint: 不允许使用2维数据来保存细胞(类似使用2个List的同样不允许)**

听到这个条件的时候大家第一次震惊了，80%的人都在用2维数组，逻辑的一大部分是在判断数组越界。

采用的改动方式是用List保存所有存活的细胞的位置,根据位置找到周围的8个邻居，看其是否存活即可。
没有边界的问题，死活完全由自身状态+周边活的邻居个数决定。

第一次写完了。

###Lunch Break
**自由交流**

###session 4
**constraint: java语言任何方法的代码行数不超过7,ruby、scala、js等语言代码行数不超过5**

思路基本没变，只是不停的拆分具体的功能块。比如:

1. 地图的状态取决于每个细胞的状态
2. 每个细胞的状态取决于当前状态+活的邻居个数
3. 活的邻居个数取决于每个邻居+其状态
4. 邻居取决于自己位置

好处就是代码更内聚更单纯。

依然没做完。

###session 5
**constraint: 不允许使用if，三目运算等任何形式的条件语句**

参考思路:
 
1. 某些情况下，直接使用表达式的值。
2. 将状态和行为通过Map关联起来
3. 使用多态

等等

部分取巧的方式

1. 边界等异常的判断改用try-catch，丑但是Work
2. if改用while，for等形式来表达，略赖皮。

好处在于降低复杂度。个人觉得有时会增加一些代码本身的复杂性。

###session 6
**constraint: 不允许使用循环**

参考思路:**使用递归**

##收获
一整天的活动参加下来，很有乐趣。

单纯coding all day本身也是一件乐事。

认识了一些别的小伙伴。技术翻译，行政，开发，产品，各种风格的人都有出现。
和各个不同风格，思想的人碰撞，交流的感触颇多。

技术上的收获也有一些，具体还是有待实践中继续积累。

[GameOfLife]: http://en.wikipedia.org/wiki/Conway's_Game_of_Life
[GlobalDayOfCodeRetreat]: http://www.infoq.com/news/2011/11/global_day_of_code_retreat