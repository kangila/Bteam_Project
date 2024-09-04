const items = document.querySelectorAll(".item");

items[0].addEventListener('click', function(){
    location.href = "/admin_sub_user"; // 변경 
});

items[1].addEventListener('click', function(){
    location.href = "/admin_sub_center";
});



/* 글의 레코드 클릭했을 때 페이지 이동 */
rows[0].addEventListener('click', function(){
    location.href = "admin_sub_center_detail";
});
rows[1].addEventListener('click', function(){
    location.href = "admin_sub_center_detail";
});
rows[2].addEventListener('click', function(){
    location.href = "admin_sub_center_detail";
});


