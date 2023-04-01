$(document).ready(function(){
    $(".wish-icon i").click(function(){
        $(this).toggleClass("fa-heart fa-heart-o");
    });
});	

// window.onload = function () {
//     // Thêm hình vào banner
	
// 	var numBanner = 9; // Số lượng hình banner
// 	for (var i = 1; i <= numBanner; i++) {
// 		var linkimg = "../img/banners/banner" + i + ".png";
// 		addBanner(linkimg, linkimg);
// 	}
    
// 	// Khởi động thư viện hỗ trợ banner - chỉ chạy khi đã tạo hình trong banner
//     //them banner 
//     const settings = {
//         "async": true,
//         "crossDomain": true,
//         "url": "http://localhost:9090/slides",
//         "method": "GET",
//         "headers": {
//             "content-type": "application/json"
//         }
//     };
    
//     $.ajax(settings).done(function (response) {
//         response.forEach(element => {
//             var newDiv = `<div class='item'>
//             <a target='_blank'>
//             <img src=../img/banners/` + element.image + `>
//             </a>
//             </div>`;
//             var banner = document.getElementsByClassName('owl-carousel')[0];
//             banner.innerHTML += newDiv;
//         });
//     });
    
//     var owl = $('.owl-carousel');
//     owl.owlCarousel({
//         items: 1.5,
//         margin: 100,
//         center: true,
//         loop: true,
//         smartSpeed: 450,
//         autoplay: true,
//         autoplayTimeout: 3500
//     });

// }
// Thêm banner
// function addBanner(img, link) {
// 	var newDiv = `<div class='item'>
// 						<a target='_blank' href=` + link + `>
// 							<img src=` + img + `>
// 						</a>
// 					</div>`;
// 	var banner = document.getElementsByClassName('owl-carousel')[0];
// 	banner.innerHTML += newDiv;
// }

