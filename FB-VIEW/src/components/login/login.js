/**
 * Created by 雅琦 on 2017/1/13.
 */
module.exports = {
  template:require("./login.html"),
  component:{},
  data:function(){
    return{
      name:"",
      password:""
    }
  },
  ready:function(){
    console.log("登陆页面加载成功")
  },
  methods:{
    sub:function(){
      var obj=this;
      obj.$root.router.go("/main");
     /* if(obj.name==''||obj.password==''){
        alert("用户名或密码不能为空");
        //return
      }
      if(obj.name=='admin'&&obj.password=='admin'){
        this.$root.name = this.name;
        this.$root.password=this.password;
        alert("登陆成功");
      }*/

    }
  }
}
