/**
 * Created by 雅琦 on 2017/1/14.
 */
module.exports={
  template:require("./music-detail.html"),
  data:function(){
    return{
      first:"",
      gridData:{}
    }
  },
  ready:function(){
    this.$http.get('http://localhost:8090/#!/src/assets/logo.png').then(function(res){
      this.first = res.body;
      console.log(this.first)
    });
  },
  methods:{
    back_home:function(){
      var obj=this;
      console.log("back");
      obj.$root.router.go("/home");
    }
  }
}
