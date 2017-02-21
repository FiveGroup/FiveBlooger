/**
 * Created by 雅琦 on 2017/1/14.
 */
module.exports={
  template:require("./home.html"),
  component:{
  },
  data:function(){
    return{
      fg_show_websites:false, //隐藏网站下拉菜单
      fg_show_writer:false,  //隐藏作者下拉菜单
    }
  },
  ready:function(){
    console.log("这里是第一个压面")
  },
  methods:{}
}
