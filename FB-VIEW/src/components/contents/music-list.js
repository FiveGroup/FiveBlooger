/**
 * Created by 雅琦 on 2017/1/13.
 */
module.exports={
  template:require('./music-list.html'),
  data:function(){
    return{}
  },
  ready:function(){

  },
  methods:{
    enter_detail:function(i){
      var obj=this;
      console.log(i);
      obj.$root.router.go("/home/detail");
    },
    get_data:function(){
      var obj=this;
      this.$http.get('http://localhost:8090/#!/src/assets/user-detail.json').then(function(res){
        console.log(res)
      });
      //this.$http.get('/someUrl', [options]).then(successCallback, errorCallback);
/*      obj.$root.Vue.http.get("https://localhost:8090/src/assets/logo.png").then(function(res){
       console.log(res)
       });*/
    }
  }
}
