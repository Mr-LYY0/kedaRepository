axios.post('url',{
  name: 'xxx'
})
.then(function(res){
  console.log(res);
})
.catch(function(err){
  console.log(err);
});