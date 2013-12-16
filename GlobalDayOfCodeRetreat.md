#Global Day Of Code Retreat

##主题

重复的做一个简单的任务，[“Conway's Game Of Life”] [GameOfLife]。

全天共有六个session，每个session包含40-50分钟左右，以及一个或者多个的限制。每个session的目的不在于完成，目的仅仅是实践。

其余更多介绍可以参考InfoQ上[Global Day Of Code Retreat] [GlobalDayOfCodeRetreat]的介绍。

##活动
早上9点开始，上午3个session，而后午休+交流。下午3个session，6点结束。
###session 1
**constraint: 没有限制，用任意喜好的语言，实现这个小功能**

这个session的主要目的是了解整个任务是神马，要实现的大体功能是神马。

这里也简单介绍一下，这是一个0-player的游戏，给定输入，就看着这个世界如何演进就OK了。

总体在描述一个世界，有一群孤独又怕挤的神奇的小细胞们，生存条件如下:

* 活细胞周围的活细胞个数小于2个时，下一次演进会死去
* 活细胞周围的活细胞个数大于3个时，下一次演进会死去
* 活细胞周围的活细胞个数等于2/3个时，下一次演进会活着
* 死细胞周围的活细胞个数等于3个时，下一次会复活

*总得来说，周围活细胞个数为3时，该细胞活着。个数为2个时，活细胞依然活着。其余情况，细胞死去。*

###session 2
**constraint: 使用TDD开发**

###session 3
**constraint: 不允许使用2维数据来保存细胞**

###Lunch Break
**自由交流**

###session 4
**constraint: java语言任何方法的代码行数不超过7,ruby、scala、js等语言代码行数不超过5**

###session 5
**constraint: 不允许使用if，三目运算等任何形式的条件语句**

###session 6
**constraint: 不允许使用循环**


##收获



[GameOfLife]: http://en.wikipedia.org/wiki/Conway's_Game_of_Life
[GlobalDayOfCodeRetreat]: http://www.infoq.com/news/2011/11/global_day_of_code_retreat