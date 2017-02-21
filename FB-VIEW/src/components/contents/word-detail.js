/**
 * Created by 雅琦 on 2017/2/15.
 */
module.exports={
  template:require('./word-detail.html'),
  data:function(){
    return{

    }
  },
  ready:function(){

  },
  methods:{
    get_data:function(){
      this.http.get("https://localhost:8090/src/assets/data").then(function(res){
        console.log(res)
      })
    }

  }
}
