<!DOCTYPE html>
<!-- saved from url=(0054)https://www.hackerrank.com/challenges/2d-array/problem -->
<html lang="en-us" style="--font-family-input:SourceCodePro, monaco, Courier, monospace; --font-family-text:OpenSans, Arial, Helvetica, sans-serif;" class=""><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  
  
  <title> 2D Array - DS | HackerRank </title><meta name="description" id="meta-description" content="How to access and use 2d-arrays."><meta property="og:title" id="meta-og-title" content="2D Array - DS | HackerRank"><meta property="og:image" id="meta-og-image" content="https://hrcdn.net/og/default.jpg"><meta property="og:description" id="meta-og-description" content="How to access and use 2d-arrays."><meta property="og:url" id="meta-og-url" content="https://www.hackerrank.com/challenges/2d-array/problem"><meta property="og:site_name" id="meta-og-site" content="HackerRank"><meta property="og:type" id="meta-og-type" content="website"><meta property="article:author" content="https://www.facebook.com/hackerrank"><meta name="twitter:card" id="meta-twitter-card" content="summary"><meta name="twitter:site" id="meta-twitter-site" content="@hackerrank"><meta name="twitter:url" id="meta-twitter-url" content="https://www.hackerrank.com/challenges/2d-array/problem"><meta name="twitter:title" id="meta-twitter-title" content="2D Array - DS | HackerRank"><meta property="fb:app_id" id="meta-fb-id" content="347499128655783"><meta content="authenticity_token" name="csrf-param" id="csrf-param"><meta content="XwZNYQsYTIY0c055+ZCX0PBK/kTUPMvdKc5eW0Kxx9GqbeFGsF1YX3OhcxeT1ABSmjTZq4+Z7uJWaBGz5CEw4w==" name="csrf-token" id="csrf-token">
  <script type="text/javascript" async="" src="./ArraySolution_files/mixpanel-2-latest.min.js.download"></script><script type="text/javascript" async="" src="./ArraySolution_files/ga.js.download"></script><script async="" src="./ArraySolution_files/gtm.js.download"></script><script>/*!
 * JavaScript Cookie v2.1.3
 * https://github.com/js-cookie/js-cookie
 *
 * Copyright 2006, 2015 Klaus Hartl & Fagner Brack
 * Released under the MIT license
 */
;(function (factory) {
	var registeredInModuleLoader = false;
	if (typeof define === 'function' && define.amd) {
		define(factory);
		registeredInModuleLoader = true;
	}
	if (typeof exports === 'object') {
		module.exports = factory();
		registeredInModuleLoader = true;
	}
	if (!registeredInModuleLoader) {
		var OldCookies = window.Cookies;
		var api = window.Cookies = factory();
		api.noConflict = function () {
			window.Cookies = OldCookies;
			return api;
		};
	}
}(function () {
	function extend () {
		var i = 0;
		var result = {};
		for (; i < arguments.length; i++) {
			var attributes = arguments[ i ];
			for (var key in attributes) {
				result[key] = attributes[key];
			}
		}
		return result;
	}

	function init (converter) {
		function api (key, value, attributes) {
			var result;
			if (typeof document === 'undefined') {
				return;
			}

			// Write

			if (arguments.length > 1) {
				attributes = extend({
					path: '/'
				}, api.defaults, attributes);

				if (typeof attributes.expires === 'number') {
					var expires = new Date();
					expires.setMilliseconds(expires.getMilliseconds() + attributes.expires * 864e+5);
					attributes.expires = expires;
				}

				try {
					result = JSON.stringify(value);
					if (/^[\{\[]/.test(result)) {
						value = result;
					}
				} catch (e) {}

				if (!converter.write) {
					value = encodeURIComponent(String(value))
						.replace(/%(23|24|26|2B|3A|3C|3E|3D|2F|3F|40|5B|5D|5E|60|7B|7D|7C)/g, decodeURIComponent);
				} else {
					value = converter.write(value, key);
				}

				key = encodeURIComponent(String(key));
				key = key.replace(/%(23|24|26|2B|5E|60|7C)/g, decodeURIComponent);
				key = key.replace(/[\(\)]/g, escape);

				return (document.cookie = [
					key, '=', value,
					attributes.expires ? '; expires=' + attributes.expires.toUTCString() : '', // use expires attribute, max-age is not supported by IE
					attributes.path ? '; path=' + attributes.path : '',
					attributes.domain ? '; domain=' + attributes.domain : '',
					attributes.secure ? '; secure' : ''
				].join(''));
			}

			// Read

			if (!key) {
				result = {};
			}

			// To prevent the for loop in the first place assign an empty array
			// in case there are no cookies at all. Also prevents odd result when
			// calling "get()"
			var cookies = document.cookie ? document.cookie.split('; ') : [];
			var rdecode = /(%[0-9A-Z]{2})+/g;
			var i = 0;

			for (; i < cookies.length; i++) {
				var parts = cookies[i].split('=');
				var cookie = parts.slice(1).join('=');

				if (cookie.charAt(0) === '"') {
					cookie = cookie.slice(1, -1);
				}

				try {
					var name = parts[0].replace(rdecode, decodeURIComponent);
					cookie = converter.read ?
						converter.read(cookie, name) : converter(cookie, name) ||
						cookie.replace(rdecode, decodeURIComponent);

					if (this.json) {
						try {
							cookie = JSON.parse(cookie);
						} catch (e) {}
					}

					if (key === name) {
						result = cookie;
						break;
					}

					if (!key) {
						result[name] = cookie;
					}
				} catch (e) {}
			}

			return result;
		}

		api.set = api;
		api.get = function (key) {
			return api.call(api, key);
		};
		api.getJSON = function () {
			return api.apply({
				json: true
			}, [].slice.call(arguments));
		};
		api.defaults = {};

		api.remove = function (key, attributes) {
			api(key, '', extend(attributes, {
				expires: -1
			}));
		};

		api.withConverter = init;

		return api;
	}

	return init(function () {});
}));
</script>
  <script>
    window.BACKEND_ENDPOINT = 'https://www.hackerrank.com/';
    window.MANIFEST_VERSION = 'd79faa5cdc';
  </script>

  

  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="icon" type="image/png" href="https://hrcdn.net/fcore/assets/favicon-62bdd46faf.png">

  <!-- Prefetch dns on production -->
  
    <link rel="dns-prefetch" href="https://hrcdn.net/">
    <link rel="dns-prefetch" href="https://d3keuzeb2crhkn.cloudfront.net/">
    <link rel="dns-prefetch" href="https://notifications.hackerrank.com/">
    <link rel="dns-prefetch" href="https://api.mixpanel.com/">
    <link rel="dns-prefetch" href="https://metrics.hackerrank.com/">
    <link rel="preconnect" href="https://sentry.io/">
    <link rel="dns-prefetch" href="https://sentry.io/">
  

  


  
    <link href="./ArraySolution_files/hackerrank_r_old_trimmed-f2753f5dc3a895f5a3f4.css" media="all" rel="stylesheet"><link rel="stylesheet" href="./ArraySolution_files/hackerrank_r_old_trimmed-f2753f5dc3a895f5a3f4.css">
  

  <link rel="stylesheet" type="text/css" href="./ArraySolution_files/hackerrank_r_app-07b5f4f577599147823c.css">
  
    <link rel="stylesheet" type="text/css" href="./ArraySolution_files/vendors_hackerrank_r_community_hackerrank_r_sourcing_applications_hackerrank_r_sourcing_company_jobs-34ddc80c12651da9bfac.css">
  
    <link rel="stylesheet" type="text/css" href="./ArraySolution_files/vendors_hackerrank_r_community_hackerrank_r_work-990746629cd6e6defcab.css">
  
    <link rel="stylesheet" type="text/css" href="./ArraySolution_files/hackerrank_r_community-2c301d85b82d332e5293.css">
  
    <link rel="stylesheet" type="text/css" href="./ArraySolution_files/vendors_custominput_hackerrank_r_challenge_hackerrank_r_code_snippets_hackerrank_r_onboarding-dcb040a3e38d4ac1aea2.css">
  
    <link rel="stylesheet" type="text/css" href="./ArraySolution_files/vendors_hackerrank_r_challenge_hackerrank_r_code_snippets_hackerrank_r_onboarding-a2be1f4f2163a959257d.css">
  
    <link rel="stylesheet" type="text/css" href="./ArraySolution_files/vendors_hackerrank_r_challenge_hackerrank_r_work-1c528035f45b29593de0.css">
  
    <link rel="stylesheet" type="text/css" href="./ArraySolution_files/hackerrank_r_challenge-0c26efacba67603caec6.css">
  

  <!-- Prefetch / preload assets on production -->
  

    <!-- preload scripts required on the same page -->
    <link rel="preload" as="script" href="./ArraySolution_files/hackerrank_r_vendor-4dd797fb49.js.download">
    <link rel="preload" as="script" href="./ArraySolution_files/hackerrank_r_app-07b5f4f577599147823c.js.download">
    <link rel="preload" as="script" href="./ArraySolution_files/runtime-035da432635eed8e43f0.js.download">

    
      <link rel="preload" as="script" href="./ArraySolution_files/vendors_hackerrank_r_community_hackerrank_r_sourcing_applications_hackerrank_r_sourcing_company_jobs_9ddfcdb2-784b7dfc9a794befbf37.js.download">
    
      <link rel="preload" as="script" href="./ArraySolution_files/vendors_hackerrank_r_community_hackerrank_r_sourcing_applications_hackerrank_r_sourcing_company_jobs-34ddc80c12651da9bfac.js.download">
    
      <link rel="preload" as="script" href="./ArraySolution_files/vendors_hackerrank_r_community_hackerrank_r_work_lsp_client-6663c88c2e4d04d77474.js.download">
    
      <link rel="preload" as="script" href="./ArraySolution_files/vendors_hackerrank_r_community_hackerrank_r_work-990746629cd6e6defcab.js.download">
    
      <link rel="preload" as="script" href="./ArraySolution_files/hackerrank_r_community-2c301d85b82d332e5293.js.download">
    
      <link rel="preload" as="script" href="./ArraySolution_files/vendors_custominput_hackerrank_r_challenge_hackerrank_r_code_snippets_hackerrank_r_onboarding-dcb040a3e38d4ac1aea2.js.download">
    
      <link rel="preload" as="script" href="./ArraySolution_files/vendors_hackerrank_r_challenge_hackerrank_r_code_snippets_hackerrank_r_onboarding-a2be1f4f2163a959257d.js.download">
    
      <link rel="preload" as="script" href="./ArraySolution_files/vendors_hackerrank_r_challenge_hackerrank_r_onboarding-f24e76841f94d2bcbdef.js.download">
    
      <link rel="preload" as="script" href="./ArraySolution_files/vendors_hackerrank_r_challenge_hackerrank_r_work-1c528035f45b29593de0.js.download">
    
      <link rel="preload" as="script" href="./ArraySolution_files/hackerrank_r_challenge-0c26efacba67603caec6.js.download">
    
    <!-- preload scripts end -->

    <!-- Prefetch old css files -->
    <link rel="prefetch" href="https://hrcdn.net/fcore/assets/backbone_styles/hackerrank-core-c7aaf0e41c.css">
    <link rel="prefetch" href="https://hrcdn.net/fcore/assets/backbone_styles/hackerrank_libraries-6d1eda62f2.css">

    
      <link rel="prefetch" href="https://hrcdn.net/fcore/assets/backbone_styles/dashboard-f9cd1b5147.css">
    
    <!-- Prefetch old css files end -->

  

  <!-- Load promise polyfill for the non-believers -->
  <script>
    window.Promise || document.write('<script src="https://hrcdn.net/fcore/assets/polyfill-d05a380d50.min.js" type="text\/javascript"><\/script>');
  </script>
  <!-- Added for GTM -->
  <!-- GTM setup -->

<script>
  dataLayer = [];
</script>

<!-- Google Tag Manager #1 -->
<script>(function(w,d,s,l,i){w[l]=w[l]||[];w[l].push({'gtm.start':
new Date().getTime(),event:'gtm.js'});var f=d.getElementsByTagName(s)[0],
j=d.createElement(s),dl=l!='dataLayer'?'&l='+l:'';j.async=true;j.src=
'https://www.googletagmanager.com/gtm.js?id='+i+dl;f.parentNode.insertBefore(j,f);
})(window,document,'script','dataLayer', 'GTM-5FXW96J');</script>
<!-- End Google Tag Manager 1 -->




                    <script async="" src="./ArraySolution_files/aksb.min.js.download"></script><script>var w=window;if(w.performance||w.mozPerformance||w.msPerformance||w.webkitPerformance){var d=document;AKSB=w.AKSB||{},AKSB.q=AKSB.q||[],AKSB.mark=AKSB.mark||function(e,_){AKSB.q.push(["mark",e,_||(new Date).getTime()])},AKSB.measure=AKSB.measure||function(e,_,t){AKSB.q.push(["measure",e,_,t||(new Date).getTime()])},AKSB.done=AKSB.done||function(e){AKSB.q.push(["done",e])},AKSB.mark("firstbyte",(new Date).getTime()),AKSB.prof={custid:"697829",ustr:"",originlat:"0",clientrtt:"15",ghostip:"165.254.0.167",ipv6:false,pct:"10",clientip:"144.121.220.14",requestid:"462a689",region:"24912",protocol:"",blver:14,akM:"g",akN:"ae",akTT:"O",akTX:"1",akTI:"462a689",ai:"345742",ra:"false",pmgn:"",pmgi:"",pmp:"",qc:""},function(e){var _=d.createElement("script");_.async="async",_.src=e;var t=d.getElementsByTagName("script"),t=t[t.length-1];t.parentNode.insertBefore(_,t)}(("https:"===d.location.protocol?"https:":"http:")+"//ds-aksb-a.akamaihd.net/aksb.min.js")}</script>
                    <script charset="utf-8" src="./ArraySolution_files/vendors_hackerrank_r_community_hackerrank_r_sourcing_applications_hackerrank_r_sourcing_company_jobs_9ddfcdb2-784b7dfc9a794befbf37.js.download"></script><script charset="utf-8" src="./ArraySolution_files/vendors_hackerrank_r_community_hackerrank_r_sourcing_applications_hackerrank_r_sourcing_company_jobs-34ddc80c12651da9bfac.js.download"></script><script charset="utf-8" src="./ArraySolution_files/vendors_hackerrank_r_community_hackerrank_r_work_lsp_client-6663c88c2e4d04d77474.js.download"></script><script charset="utf-8" src="./ArraySolution_files/vendors_hackerrank_r_community_hackerrank_r_work-990746629cd6e6defcab.js.download"></script><script charset="utf-8" src="./ArraySolution_files/hackerrank_r_community-2c301d85b82d332e5293.js.download"></script><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_challenge_list-4f6a661cd5420263b8a6.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/vendors~hackerrank_r_challenge_list~hackerrank_r_challenge_list_v2~hackerrank_r_interview~hackerrank~1976138a-a5ca0a1d7331913ab152.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/vendors~hackerrank_r_challenge_list~hackerrank_r_challenge_list_v2~hackerrank_r_interview~hackerrank~14aa502a-f9e5bcabc62f8ce06462.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_challenge_list~hackerrank_r_challenge_list_v2~hackerrank_r_interview-4ee6ce22d91c0101ff07.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_challenge_list~hackerrank_r_challenge_list_v2~hackerrank_r_interview-4ee6ce22d91c0101ff07.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_challenge_list-4f6a661cd5420263b8a6.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_challenge_list_v2-540e6630f7ceddb0b3aa.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_challenge_list_v2-540e6630f7ceddb0b3aa.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_forum-7c22e83d8d2c4f47d9cd.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/vendors~hackerrank_r_code_snippets~hackerrank_r_forum-01c9d8538b2955d735ff.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_forum-7c22e83d8d2c4f47d9cd.css"><link rel="prefetch" href="./ArraySolution_files/vendors_custominput_hackerrank_r_challenge_hackerrank_r_code_snippets_hackerrank_r_onboarding-dcb040a3e38d4ac1aea2.css"><link rel="prefetch" href="./ArraySolution_files/vendors_hackerrank_r_challenge_hackerrank_r_code_snippets_hackerrank_r_onboarding-a2be1f4f2163a959257d.css"><link rel="prefetch" href="./ArraySolution_files/vendors_hackerrank_r_challenge_hackerrank_r_work-1c528035f45b29593de0.css"><link rel="prefetch" href="./ArraySolution_files/hackerrank_r_challenge-0c26efacba67603caec6.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_leaderboardv2-fac5fe012839f752e80f.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_leaderboard~hackerrank_r_leaderboardv2-62b77e936bd79f578c64.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_leaderboard~hackerrank_r_leaderboardv2-62b77e936bd79f578c64.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_leaderboardv2-fac5fe012839f752e80f.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_contest-1e36bc3d1ec05efd1039.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_contest-1e36bc3d1ec05efd1039.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_dashboard-1f7948dc4e7ec3f42356.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/vendors~hackerrank_r_dashboard~hackerrank_r_work-07d83a664cb45627b84a.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_dashboard-1f7948dc4e7ec3f42356.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_leaderboard-cb2d765c30afa3c7fdfa.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/vendors~hackerrank_r_leaderboard-c2ed9efec73b67f060ca.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/vendors~hackerrank_r_leaderboard-c2ed9efec73b67f060ca.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_leaderboard-cb2d765c30afa3c7fdfa.css"><style>
html.scroll-hidden,html.scroll-hidden body{
  overflow: hidden;
  height:100vh;
}
html.scroll-hidden.pad-adjustment body{
    padding-right : 17px;
}
html.scroll-hidden.pad-adjustment .fixed-elm{
    padding-right : 17px;
}</style><script charset="utf-8" src="./ArraySolution_files/hackerrank_r_old_trimmed-f2753f5dc3a895f5a3f4.js.download"></script><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_company_header-ed7e06a24145d0829e63.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_company_header-ed7e06a24145d0829e63.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_jobs-6a4dc32ba4490349a5a4.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/vendors~hackerrank_r_jobs~hackerrank_r_testinvite~hackerrank_r_testsettings-c346095ce55f4cbba97a.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/vendors~hackerrank_r_jobs-8e70fff5fe85b532de36.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/vendors~hackerrank_r_jobs-8e70fff5fe85b532de36.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_jobs-6a4dc32ba4490349a5a4.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_profile_v2-a9fc37cd6427c0c43891.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_profile_v2~hackerrank_r_sourcing_company-c76ffee424367af0ef1a.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/vendors~hackerrank_r_profile_v2~hackerrank_r_sourcing_company-b840517968a1ed6573ca.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/vendors~hackerrank_r_profile_v2~hackerrank_r_sourcing_company-b840517968a1ed6573ca.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_profile_v2~hackerrank_r_sourcing_company-c76ffee424367af0ef1a.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_profile_v2-a9fc37cd6427c0c43891.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_calendar-326d6923eee4d81be190.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/vendors~hackerrank_r_calendar-792f7e0ba6c036f755ef.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_calendar-326d6923eee4d81be190.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_code_snippets-628e46c01ccaed270bb2.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_code_snippets~hackerrank_r_onboarding-30a9d43a36df6f11a0ff.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_code_snippets~hackerrank_r_onboarding-30a9d43a36df6f11a0ff.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_code_snippets-628e46c01ccaed270bb2.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_onboarding-e7b2730529fa742094c1.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_onboarding-e7b2730529fa742094c1.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/vendors~hackerrank_r_charts-044048cda119b40c10ee.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/vendors~hackerrank_r_charts-044048cda119b40c10ee.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_scoring-a73088d3d54959c38287.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_scoring-a73088d3d54959c38287.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_interview-2a43ccd37ffec83cc249.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/vendors~hackerrank_r_interview-f7e33d3d5953c7458774.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/vendors~hackerrank_r_interview-f7e33d3d5953c7458774.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_interview-2a43ccd37ffec83cc249.css"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_auth-833e65eaacda4b323ce0.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_auth-833e65eaacda4b323ce0.css"><link rel="prefetch" href="./ArraySolution_files/hackerrank_r_krackjack-e9c78ce67f6cfdc18b4e.js.download"><link rel="prefetch" href="./ArraySolution_files/vendors_hackerrank_r_krackjack-748a8d7ac9d0ed89d321.js.download"><link rel="prefetch" href="./ArraySolution_files/vendors_hackerrank_r_krackjack-748a8d7ac9d0ed89d321.css"><script charset="utf-8" src="./ArraySolution_files/vendors_custominput_hackerrank_r_challenge_hackerrank_r_code_snippets_hackerrank_r_onboarding-dcb040a3e38d4ac1aea2.js.download"></script><script charset="utf-8" src="./ArraySolution_files/vendors_hackerrank_r_challenge_hackerrank_r_code_snippets_hackerrank_r_onboarding-a2be1f4f2163a959257d.js.download"></script><script charset="utf-8" src="./ArraySolution_files/vendors_hackerrank_r_challenge_hackerrank_r_onboarding-f24e76841f94d2bcbdef.js.download"></script><script charset="utf-8" src="./ArraySolution_files/vendors_hackerrank_r_challenge_hackerrank_r_work-1c528035f45b29593de0.js.download"></script><script charset="utf-8" src="./ArraySolution_files/hackerrank_r_challenge-0c26efacba67603caec6.js.download"></script><link rel="prefetch" href="https://hrcdn.net/fcore/assets/hackerrank_r_codeshell_lib-7108133168e46d51ec77.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/vendors~hackerrank_r_codeshell_lib~hackerrank_r_teams-98382a52dc631cc56457.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/vendors~hackerrank_r_codeshell_lib-2d9879eb7c255b4a7f07.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/codeshell_editor_theme_m-2153ad0143b1a740df9b.js"><link rel="prefetch" href="https://hrcdn.net/fcore/assets/codeshell_editor_theme_m-2153ad0143b1a740df9b.css"><link rel="stylesheet" type="text/css" href="./ArraySolution_files/vendors_hackerrank_r_krackjack-748a8d7ac9d0ed89d321.css"><script charset="utf-8" src="./ArraySolution_files/vendors_hackerrank_r_krackjack-748a8d7ac9d0ed89d321.js.download"></script><script charset="utf-8" src="./ArraySolution_files/hackerrank_r_krackjack-e9c78ce67f6cfdc18b4e.js.download"></script><style type="text/css" media="screen" class="monaco-colors">.monaco-editor .accessibilityHelpWidget { background-color: #efeff2; }
.monaco-editor .accessibilityHelpWidget { box-shadow: 0 2px 8px #a8a8a8; }
.monaco-editor, .monaco-editor-background, .monaco-editor .inputarea.ime-input { background-color: #fffffe; }
.monaco-editor, .monaco-editor .inputarea.ime-input { color: #000000; }
.monaco-editor .margin { background-color: #fffffe; }
.monaco-editor .rangeHighlight { background-color: rgba(253, 255, 0, 0.2); }
.vs-whitespace { color: rgba(51, 51, 51, 0.2) !important; }
.monaco-editor .bracket-match { background-color: rgba(0, 100, 0, 0.1); }
.monaco-editor .bracket-match { border: 1px solid #b9b9b9; }
.monaco-editor .monaco-editor-overlaymessage .anchor { border-top-color: #007acc; }
.monaco-editor .monaco-editor-overlaymessage .message { border: 1px solid #007acc; }
.monaco-editor .monaco-editor-overlaymessage .message { background-color: #d6ecf2; }
.monaco-editor .codelens-decoration { color: #999999; }
.monaco-editor .codelens-decoration > a:hover { color: #0000ff !important; }
.monaco-editor .findMatch { background-color: rgba(234, 92, 0, 0.33); }
.monaco-editor .currentFindMatch { background-color: #a8ac94; }
.monaco-editor .findScope { background-color: rgba(180, 180, 180, 0.3); }
.monaco-editor .find-widget { background-color: #efeff2; }
.monaco-editor .find-widget { box-shadow: 0 2px 8px #a8a8a8; }
.monaco-editor .find-widget.no-results .matchesCount { color: #a1260d; }
.monaco-editor .find-widget .monaco-sash { background-color: #c8c8c8; width: 3px !important; margin-left: -4px;}
.monaco-editor .findOptionsWidget { background-color: #efeff2; }
.monaco-editor .findOptionsWidget { box-shadow: 0 2px 8px #a8a8a8; }
.monaco-editor .line-numbers { color: #237893; }
.monaco-editor .current-line ~ .line-numbers { color: #0b216f; }
.monaco-editor .view-overlays .current-line { background-color: #eaf2fe; }
.monaco-editor .margin-view-overlays .current-line-margin { background-color: #eaf2fe; border: none; }
.monaco-editor .lines-content .cigr { box-shadow: 1px 0 0 0 #d3d3d3 inset; }
.monaco-editor .lines-content .cigra { box-shadow: 1px 0 0 0 #939393 inset; }
.monaco-editor .view-ruler { box-shadow: 1px 0 0 0 #d3d3d3 inset; }
.monaco-editor .scroll-decoration { box-shadow: #dddddd 0 6px 6px -6px inset; }
.monaco-editor .focused .selected-text { background-color: #add6ff; }
.monaco-editor .selected-text { background-color: #e5ebf1; }
.monaco-editor .cursor { background-color: #000000; border-color: #000000; color: #ffffff; }
.monaco-editor .minimap-slider, .monaco-editor .minimap-slider .minimap-slider-horizontal { background: rgba(100, 100, 100, 0.2); }
.monaco-editor .minimap-slider:hover, .monaco-editor .minimap-slider:hover .minimap-slider-horizontal { background: rgba(100, 100, 100, 0.35); }
.monaco-editor .minimap-slider.active, .monaco-editor .minimap-slider.active .minimap-slider-horizontal { background: rgba(0, 0, 0, 0.3); }
.monaco-editor .minimap-shadow-visible { box-shadow: #dddddd -6px 0 6px -6px inset; }
.monaco-editor .squiggly-error { background: url("data:image/svg+xml,%3Csvg%20xmlns%3D'http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg'%20viewBox%3D'0%200%206%203'%20enable-background%3D'new%200%200%206%203'%20height%3D'3'%20width%3D'6'%3E%3Cg%20fill%3D'%23d60a0a'%3E%3Cpolygon%20points%3D'5.5%2C0%202.5%2C3%201.1%2C3%204.1%2C0'%2F%3E%3Cpolygon%20points%3D'4%2C0%206%2C2%206%2C0.6%205.4%2C0'%2F%3E%3Cpolygon%20points%3D'0%2C2%201%2C3%202.4%2C3%200%2C0.6'%2F%3E%3C%2Fg%3E%3C%2Fsvg%3E") repeat-x bottom left; }
.monaco-editor .squiggly-warning { background: url("data:image/svg+xml,%3Csvg%20xmlns%3D'http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg'%20viewBox%3D'0%200%206%203'%20enable-background%3D'new%200%200%206%203'%20height%3D'3'%20width%3D'6'%3E%3Cg%20fill%3D'%23117711'%3E%3Cpolygon%20points%3D'5.5%2C0%202.5%2C3%201.1%2C3%204.1%2C0'%2F%3E%3Cpolygon%20points%3D'4%2C0%206%2C2%206%2C0.6%205.4%2C0'%2F%3E%3Cpolygon%20points%3D'0%2C2%201%2C3%202.4%2C3%200%2C0.6'%2F%3E%3C%2Fg%3E%3C%2Fsvg%3E") repeat-x bottom left; }
.monaco-editor .squiggly-info { background: url("data:image/svg+xml,%3Csvg%20xmlns%3D'http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg'%20viewBox%3D'0%200%206%203'%20enable-background%3D'new%200%200%206%203'%20height%3D'3'%20width%3D'6'%3E%3Cg%20fill%3D'%23008000'%3E%3Cpolygon%20points%3D'5.5%2C0%202.5%2C3%201.1%2C3%204.1%2C0'%2F%3E%3Cpolygon%20points%3D'4%2C0%206%2C2%206%2C0.6%205.4%2C0'%2F%3E%3Cpolygon%20points%3D'0%2C2%201%2C3%202.4%2C3%200%2C0.6'%2F%3E%3C%2Fg%3E%3C%2Fsvg%3E") repeat-x bottom left; }
.monaco-editor .squiggly-hint { background: url("data:image/svg+xml,%3Csvg%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20height%3D%223%22%20width%3D%2212%22%3E%3Cg%20fill%3D%22%236c6c6c%22%3E%3Ccircle%20cx%3D%221%22%20cy%3D%221%22%20r%3D%221%22%2F%3E%3Ccircle%20cx%3D%225%22%20cy%3D%221%22%20r%3D%221%22%2F%3E%3Ccircle%20cx%3D%229%22%20cy%3D%221%22%20r%3D%221%22%2F%3E%3C%2Fg%3E%3C%2Fsvg%3E") no-repeat bottom left; }
.showUnused .monaco-editor .squiggly-inline-unnecessary { opacity: 0.467; will-change: opacity; }
.monaco-editor .reference-zone-widget .ref-tree .referenceMatch { background-color: rgba(234, 92, 0, 0.3); }
.monaco-editor .reference-zone-widget .preview .reference-decoration { background-color: rgba(245, 216, 2, 0.87); }
.monaco-editor .reference-zone-widget .ref-tree { background-color: #f3f3f3; }
.monaco-editor .reference-zone-widget .ref-tree { color: #646465; }
.monaco-editor .reference-zone-widget .ref-tree .reference-file { color: #1e1e1e; }
.monaco-editor .reference-zone-widget .ref-tree .monaco-tree.focused .monaco-tree-rows > .monaco-tree-row.selected:not(.highlighted) { background-color: rgba(51, 153, 255, 0.2); }
.monaco-editor .reference-zone-widget .ref-tree .monaco-tree.focused .monaco-tree-rows > .monaco-tree-row.selected:not(.highlighted) { color: #6c6c6c !important; }
.monaco-editor .reference-zone-widget .preview .monaco-editor .monaco-editor-background,.monaco-editor .reference-zone-widget .preview .monaco-editor .inputarea.ime-input {	background-color: #f2f8fc;}
.monaco-editor .reference-zone-widget .preview .monaco-editor .margin {	background-color: #f2f8fc;}
.monaco-editor .goto-definition-link { color: #0000ff !important; }
.monaco-editor .hoverHighlight { background-color: rgba(173, 214, 255, 0.15); }
.monaco-editor .monaco-editor-hover { background-color: #efeff2; }
.monaco-editor .monaco-editor-hover { border: 1px solid #c8c8c8; }
.monaco-editor .monaco-editor-hover .hover-row:not(:first-child):not(:empty) { border-top: 1px solid rgba(200, 200, 200, 0.5); }
.monaco-editor .monaco-editor-hover a { color: #006ab1; }
.monaco-editor .monaco-editor-hover code { background-color: rgba(220, 220, 220, 0.4); }
.monaco-editor.vs .valueSetReplacement { outline: solid 2px #b9b9b9; }
.monaco-editor .tokens-inspect-widget { border: 1px solid #c8c8c8; }
.monaco-editor .tokens-inspect-widget .tokens-inspect-separator { background-color: #c8c8c8; }
.monaco-editor .tokens-inspect-widget { background-color: #efeff2; }
.monaco-editor .detected-link-active { color: #0000ff !important; }
.monaco-editor .parameter-hints-widget { border: 1px solid #c8c8c8; }
.monaco-editor .parameter-hints-widget.multiple .body { border-left: 1px solid rgba(200, 200, 200, 0.5); }
.monaco-editor .parameter-hints-widget .signature.has-docs { border-bottom: 1px solid rgba(200, 200, 200, 0.5); }
.monaco-editor .parameter-hints-widget { background-color: #efeff2; }
.monaco-editor .parameter-hints-widget a { color: #006ab1; }
.monaco-editor .parameter-hints-widget code { background-color: rgba(220, 220, 220, 0.4); }
.monaco-editor .suggest-widget .monaco-list .monaco-list-row .monaco-highlighted-label .highlight { color: #007acc; }
.monaco-editor .suggest-widget { color: #000000; }
.monaco-editor .suggest-widget a { color: #006ab1; }
.monaco-editor .suggest-widget code { background-color: rgba(220, 220, 220, 0.4); }
.monaco-editor .focused .selectionHighlight { background-color: rgba(173, 214, 255, 0.3); }
.monaco-editor .selectionHighlight { background-color: rgba(173, 214, 255, 0.15); }
.monaco-editor .wordHighlight { background-color: rgba(87, 87, 87, 0.25); }
.monaco-editor .wordHighlightStrong { background-color: rgba(14, 99, 156, 0.25); }
.monaco-diff-editor .diff-review-line-number { color: #237893; }
.monaco-diff-editor .diff-review-shadow { box-shadow: #dddddd 0 -6px 6px -6px inset; }
.monaco-editor .line-insert, .monaco-editor .char-insert { background-color: rgba(155, 185, 85, 0.2); }
.monaco-diff-editor .line-insert, .monaco-diff-editor .char-insert { background-color: rgba(155, 185, 85, 0.2); }
.monaco-editor .inline-added-margin-view-zone { background-color: rgba(155, 185, 85, 0.2); }
.monaco-editor .line-delete, .monaco-editor .char-delete { background-color: rgba(255, 0, 0, 0.2); }
.monaco-diff-editor .line-delete, .monaco-diff-editor .char-delete { background-color: rgba(255, 0, 0, 0.2); }
.monaco-editor .inline-deleted-margin-view-zone { background-color: rgba(255, 0, 0, 0.2); }
.monaco-diff-editor.side-by-side .editor.modified { box-shadow: -6px 0 5px -5px #dddddd; }

.mtk1 { color: #000000; }
.mtk2 { color: #fffffe; }
.mtk3 { color: #808080; }
.mtk4 { color: #ff0000; }
.mtk5 { color: #0451a5; }
.mtk6 { color: #0000ff; }
.mtk7 { color: #09885a; }
.mtk8 { color: #008000; }
.mtk9 { color: #dd0000; }
.mtk10 { color: #383838; }
.mtk11 { color: #cd3131; }
.mtk12 { color: #863b00; }
.mtk13 { color: #af00db; }
.mtk14 { color: #800000; }
.mtk15 { color: #e00000; }
.mtk16 { color: #3030c0; }
.mtk17 { color: #666666; }
.mtk18 { color: #778899; }
.mtk19 { color: #ff00ff; }
.mtk20 { color: #608b4e; }
.mtk21 { color: #a31515; }
.mtk22 { color: #4f76ac; }
.mtk23 { color: #008080; }
.mtk24 { color: #001188; }
.mtk25 { color: #4864aa; }
.mtki { font-style: italic; }
.mtkb { font-weight: bold; }
.mtku { text-decoration: underline; text-underline-position: under; }</style><script charset="utf-8" src="./ArraySolution_files/123-7c8b8ad88530c15485e6.js.download"></script><style type="text/css" media="screen"></style></head>
<body id="hr_v2" class="hr-community">
  <div id="fb-root"></div>
  

  <!-- Just a placeholder div to start loading open sans and source code loader -->
  <div class="font-open-sans-loader"></div>
  <div class="font-source-code-loader"></div>
  <!-- Just a placeholder div to start loading open sans and source code loader end -->

  <div id="content" onclick="void(0);"><div class="ui-kit-root"><div class="body-wrap  community-page challenges-page problem-page show-cookie-banner" style=""><div class="toast-message loading"><span class="toast-container containment"><i class="ui-icon-loading"></i><span class="toast-text">Loading...</span></span></div><div class="theme-m new-design logged-user"><div class="page-header-wrapper theme-m-section"><nav class="community-header"><div class="container"><div class="header-nav-links theme-m-section"><ul class="nav-links"><li class="nav-link-item logo-wrap"><a class="nav_link backbone logo_mark js_logo_mark logo-link" data-analytics="NavBarLogo" data-attr1="/dashboard" href="https://www.hackerrank.com/dashboard"><img id="feed-intro" class="logo-img-small" src="./ArraySolution_files/h_mark_sm-966d2b45e3.svg" alt=""></a></li><li class="nav-link-item"><a class="nav-link dashboard active" data-analytics="NavBarDomains" href="https://www.hackerrank.com/dashboard"><span>Practice</span></a></li><li class="nav-link-item"><a class="nav-link contests" data-analytics="NavBarContests" href="https://www.hackerrank.com/contests"><span>Compete</span></a></li><li class="nav-link-item"><a class="nav-link" data-analytics="NavBarJobs" href="https://www.hackerrank.com/jobs"><span>Jobs</span><i class="ui-icon-circle-filled notification-indicator hidden"></i></a></li><li class="nav-link-item"><a class="nav-link" data-analytics="NavBarLeaderboard" id="leaderboard-nav-link" href="https://www.hackerrank.com/leaderboard"><span>Leaderboard</span></a></li></ul></div><div class="nav-buttons theme-m-section"><ul class="pull-left psR"><li class="hide-in-private-contest search-input-container input-icon main-hr-search" id="search-span"><div class="search-form new-search"><div><div class="search-query asyn-autocomplete autocomplete"><div class="ac-input-wrap cf"><input autocomplete="off" class="ac-input " value="" placeholder="Search"></div></div><i class="ui-icon-search"></i></div></div></li></ul><ul class="pull-left nav-wrap mmL"><li class="hide-in-private-contest button-item"><div class="dropdown dropdown message-dropdown notify-dropdown theme-m-content"><a class="cursor dropdown-handle nav_link hr_nav_messages_link js-dropdown-toggle js-link" data-analytics="NavBarMessageIcon"><i class="dropdown-icon ui-icon-message"></i></a><div class="dropdown-menu large"><header class="psT psB text-center menu-header"><strong class="header-title">Messages</strong></header><div id="notify_messages" class="dropdown-body"><div class="hr_nav_messages_list"><div class="no-propagation text-center txt-navy empty-msg">You have no unread messages.</div></div></div><footer class="final text-center show-all"><a class="btn show-all-link" href="https://www.hackerrank.com/inbox" data-analytics="NavBarMessageShowAll">Show All</a></footer></div></div></li><li class="button-item"><div class="dropdown dropdown notification-dropdown notify-dropdown theme-m-content"><a class="cursor dropdown-handle nav_link hr_nav_notifications_link js-dropdown-toggle js-link" data-toggle="dropdown" data-analytics="NavBarNotificationsIcon"><i class="dropdown-icon ui-icon-notification"></i><span class="indicator number-indicator hr_notifications_count">1</span></a><div class="dropdown-menu large" id="notify_broadcasts"><header class="psA menu-header"><strong class="header-title">Notifications</strong><a class="hr_archive_all archive pull-right js-link" data-analytics="NavBarNotificationsArchiveAll"><i class="icon-folder-open"></i>Archive All</a></header><div class="clearfix dropdown-body"><div class="hr_nav_notifications_list"><ul><li class="notify_item dropdown-item cursor" data-id="72971309" data-category="contest-announcements" data-url="/domains/tutorials/30-days-of-code"><div class="notification-icon"><img src="./ArraySolution_files/notifymarker-4be6d5a4c8.png"></div><div class="notification-subject pmT"><div class="psA"><div>Improve your coding skills. Join our 30 Days of Code challenge!</div><small class="meta"><time class="time-text" datetime="2019-03-01T03:16:31.000Z" title="2019-03-01 03:16">49 minutes ago</time></small></div></div></li></ul></div></div><footer class="final show-all"><a class="btn show-all-link" href="https://www.hackerrank.com/notifications" data-analytics="NavBarNotificationsShowAll">Show All</a></footer></div></div></li><li class="button-item"><div class="dropdown dropdown dropdown-auth profile-menu cursor theme-m-content"><a class="backbone nav_link js-dropdown-toggle js-link toggle-wrap" data-analytics="NavBarProfileDropDown"><i class="ui-icon-user default-user-icon"></i><span class="mmR username text-ellipsis">atorczyn</span><i class="ui-icon-chevron-down down-icon"></i></a><div class="dropdown-menu drop-list pull-right"><ul><li class="hide-in-private-contest profile-nav-item"><a class="navigation_hackos hackos-count" data-analytics="NavBarProfileDropDownHackos" href="https://www.hackerrank.com/atorczyn/hackos">Hackos: <span class="navigation_hackos-count">106</span></a></li><li class="hide-in-private-contest profile-nav-item"><a rel="tooltip" data-placement="left" data-analytics="NavBarProfileDropDownProfile" href="https://www.hackerrank.com/atorczyn">Profile<div class="ui-progress-bar progress-bar theme-default"><div class="progress-filler" style="width:30%"></div></div></a></li><li class="hide-in-private-contest profile-nav-item"><a href="https://www.hackerrank.com/settings" data-analytics="NavBarProfileDropDownSettings">Settings</a></li><li class="hide-in-private-contest profile-nav-item"><a href="https://www.hackerrank.com/challenges/bookmarks" data-analytics="NavBarDropDownBookmarks">Bookmarks</a></li><li class="hide-in-private-contest profile-nav-item"><a href="https://www.hackerrank.com/network" data-analytics="NavBarProfileDropDownNetwork">Network</a></li><li class="hide-in-private-contest profile-nav-item"><a href="https://www.hackerrank.com/submissions" data-analytics="NavBarProfileDropDownSubmissions">Submissions</a></li><li class="hide-in-private-contest profile-nav-item"><a href="https://www.hackerrank.com/administration" data-analytics="NavBarProfileDropDownAdministration">Administration</a></li><li class="profile-nav-item"><a class="logout-button js-link" data-analytics="NavBarProfileDropDownLogout">Logout</a></li></ul></div></div></li></ul></div></div></nav></div><header class="community-header-breadcrumb"><div class="container"><div class="d-flex justify-content-between align-items-center content-header-wrapper"><div class="community-header-breadcrumb-items"><ol itemtype="http://schema.org/BreadcrumbList" class="community-breadcrumb text-content"><li itemprop="itemListElement" itemtype="http://schema.org/ListItem" class="breadcrumb-item"><a itemprop="item" class="breadcrumb-link" data-analytics="Breadcrumb" data-attr1="Practice" data-attr2="global" data-attr7="1" href="https://www.hackerrank.com/dashboard"><span itemprop="name" class="breadcrumb-item-text">Practice</span></a><meta itemprop="position" content="1"></li><li itemprop="itemListElement" itemtype="http://schema.org/ListItem" class="breadcrumb-item"><span class="ui-icon-chevron-right mmL mmR chevron-icon"></span><a itemprop="item" class="breadcrumb-link" data-analytics="Breadcrumb" data-attr1="Data Structures" data-attr2="global" data-attr7="1" href="https://www.hackerrank.com/domains/data-structures"><span itemprop="name" class="breadcrumb-item-text">Data Structures</span></a><meta itemprop="position" content="1"></li><li itemprop="itemListElement" itemtype="http://schema.org/ListItem" class="breadcrumb-item"><span class="ui-icon-chevron-right mmL mmR chevron-icon"></span><a itemprop="item" class="breadcrumb-link" data-analytics="Breadcrumb" data-attr1="Arrays" data-attr2="global" data-attr7="1" href="https://www.hackerrank.com/domains/data-structures/arrays"><span itemprop="name" class="breadcrumb-item-text">Arrays</span></a><meta itemprop="position" content="1"></li><li itemprop="itemListElement" itemtype="http://schema.org/ListItem" class="breadcrumb-item"><span class="ui-icon-chevron-right mmL mmR chevron-icon"></span><span itemprop="name" class="breadcrumb-item-text">2D Array - DS</span><meta itemprop="position" content="1"></li></ol><div class="page-label-wrapper text-headline"><h1 class="page-label"><div class="challenge-page-label-wrapper align-items-center"><h1 class="ui-icon-label page-label">2D Array - DS</h1><button class="ui-btn ui-btn-normal ui-btn-plain star-button" tabindex="0" aria-label="Add bookmark"><div class="ui-content align-icon-right"><span class="ui-text"><i class="icon-bookmark star-icon ui-icon-star"></i></span></div></button></div></h1></div></div><div class="community-header-aside"><div class="challange-header-aside"><div class="track-badge-progress"><div class="badge-progress"><div class="remaining"><div class="point-left-wrap"><span class="point-left">70 more points</span> to get your next star!</div><div class="track-progress-bar"><div class="ui-progress-bar progress-bar theme-default"><div class="progress-filler" style="width: 0%;"></div></div></div><div class="score-info"><span class="current-rank">Rank: <span class="value">1001879</span></span><span class="pipe">|</span><span class="current-points">Points: <span class="value">30/100</span></span><a class="scoring-link" data-analytics="BadgeLearnMoreLink" data-attr1="problem-solving" target="_blank" href="https://www.hackerrank.com/scoring"><i class="scoring-icon ui-icon-warning-hexagon"></i></a></div></div><div location="[object Object]" params="[object Object]" router="[object Object]" class="ui-badge level-bronze"><div class="ui-badge-wrap"><svg viewBox="0 0 91.66667 100" class="hexagon"><g><defs><lineargradient id="badge-bronze-gradient" x1="52.5" y1="2.5" x2="52.5" y2="102.5" gradientUnits="userSpaceOnUse"><stop offset="0" stop-color="#ffc5ab"></stop><stop offset="1" stop-color="#ffa38a"></stop></lineargradient></defs><path fill="url(#badge-bronze-gradient)" d="M98.28277,47.36h0c-.18459-9.382-.87983-17.797-2.0917-19.8595-1.02214-1.742-6.1721-5.43476-12.6195-9.45853L66.3804,8.23311C59.94162,4.89541,54.4699,2.5,52.49778,2.5c-2.42987,0-10.17687,3.63131-18.49789,8.18049-6.30411,3.44623-12.9328,7.41557-17.83631,10.74623-3.85037,2.61278-6.63864,4.828-7.35893,6.07393-.73574,1.27216-1.28014,4.91124-1.63613,9.67794l-.00014-.00008c-.45195,6.03951-.599,13.88935-.43933,21.10033.20233,9.11082.89243,17.18541,2.07561,19.22049C11.66541,82.42328,46.78277,102.5,52.49778,102.5c2.374,0,9.82245-3.47115,17.92388-7.87722,6.4-3.48081,13.19866-7.5418,18.23618-10.9459l-.00046-.00026c3.93694-2.6605,6.80064-4.91944,7.53385-6.17728.72907-1.2482,1.27024-4.80557,1.62881-9.48065l-.00014-.00008C98.269,62.13222,98.42408,54.47227,98.28277,47.36Z" transform="translate(-6.66667 -2.5)"></path></g><image class="badge-icon" xlink:href="https://hrcdn.net/fcore/assets/badges/problem-solving-ecaf59a612.svg" x="50%" y="22" height="27" width="27" transform="translate(-13.5, 0)"></image><text class="badge-title" x="50%" y="65.5" font-size="10">Problem Solving</text><g class="star-section" transform="translate(-3.5, 0)"><svg x="50%" y="71" height="10"><svg class="badge-star" viewBox="0 0 6.54904 6.25825" width="7" x="0"><path class="star" d="M55.51425,77.01983l-1.89417-.275-.84833-1.7175a.299.299,0,0,0-.27167-.16917.3245.3245,0,0,0-.2725.16917l-.305.61833-.5425,1.09916-.51417.075-1.38.2a.30333.30333,0,0,0-.18583.10083.33411.33411,0,0,0-.045.06833.35631.35631,0,0,0-.02417.07667.34087.34087,0,0,0-.005.04083.3038.3038,0,0,0,.02417.13417.33341.33341,0,0,0,.06667.0975l1.37167,1.33667-.2875,1.67167-.03667.21417c-.00167.01-.00167.02-.0025.02917l-.00167.0175a.26453.26453,0,0,0,.00167.04417.30489.30489,0,0,0,.44417.22917l1.69417-.89,1.69416.89a.30352.30352,0,0,0,.44084-.32L54.31175,78.874l1.37083-1.33667a.30339.30339,0,0,0-.16833-.5175" transform="translate(-49.22548 -74.85817)"></path></svg></svg></g></svg></div></div></div></div></div></div></div></div></header><div class="container"></div><div class="community-content"><div class="challenge-view theme-m"><div class="challenge-page-header container"><div class="ui-card theme-m-content submission-status-banner ui-layer-2"><div class="card-content"><div class="submission-model-wrapper"><div class="points-message">Your 2D Array - DS submission got 10.00 points.</div><div class="share-btns-wrap"><iframe src="./ArraySolution_files/share_button.html" scrolling="no" frameborder="0" class="share-btn" allowtransparency="true"></iframe>&nbsp;&nbsp;<iframe src="./ArraySolution_files/tweet_button.html" scrolling="no" frameborder="0" class="share-btn" allowtransparency="true"></iframe></div><div class="next-star-message"><span>You are now 70 points away from the 2nd star for your problem solving badge.</span></div></div><span class="ui-icon-cross cross-icon"></span></div></div><div class="ui-tabs-wrap"><div class="render-list clearfix"><ul class="tab-header"><li id="Problem" class="tab-item active"><a class="tab-item-color" data-analytics="ChallengeViewTab" data-attr1="/challenges/2d-array/problem" data-attr2="Problem" href="https://www.hackerrank.com/challenges/2d-array/problem"><span class="ui-icon-label">Problem</span></a></li><li id="Submissions" class="tab-item"><a class="tab-item-color" data-analytics="ChallengeViewTab" data-attr1="/challenges/2d-array/submissions" data-attr2="Submissions" href="https://www.hackerrank.com/challenges/2d-array/submissions"><span class="ui-icon-label">Submissions</span></a></li><li id="Leaderboard" class="tab-item"><a class="tab-item-color" data-analytics="ChallengeViewTab" data-attr1="/challenges/2d-array/leaderboard" data-attr2="Leaderboard" href="https://www.hackerrank.com/challenges/2d-array/leaderboard"><span class="ui-icon-label">Leaderboard</span></a></li><li id="Discussions" class="tab-item"><a class="tab-item-color" data-analytics="ChallengeViewTab" data-attr1="/challenges/2d-array/forum" data-attr2="Discussions" href="https://www.hackerrank.com/challenges/2d-array/forum"><span class="ui-icon-label">Discussions</span></a></li><li id="Editorial" class="tab-item"><a class="tab-item-color" data-analytics="ChallengeViewTab" data-attr1="/challenges/2d-array/editorial" data-attr2="Editorial" href="https://www.hackerrank.com/challenges/2d-array/editorial"><span class="ui-icon-label">Editorial</span><i class="ui-icon-lock"></i></a></li></ul></div></div></div><section class="challenge-interface challenge-problem"><div class="challenge-body"><div class="challenge-body-elements-problem challenge-container-element"><div class="container challenge-page-wrap panes-container theme-m-content"><div class="full-screen-split split-wrap left-pane"><section class="problem-statement split"><div class="ui-tabs-wrap"><div class="tab-list-content"><div class="theme-m hr_tour-problem-statement problem-statement have-external-links"><div class="content-text challenge-text mlB hackdown-container theme-m"><div class="challenge-body-html"><div class="challenge_problem_statement"><div class="msB challenge_problem_statement_body"><div class="hackdown-content"><style id="MathJax_SVG_styles">.MathJax_SVG_Display {text-align: center; margin: 1em 0em; position: relative; display: block!important; text-indent: 0; max-width: none; max-height: none; min-width: 0; min-height: 0; width: 100%}
.MathJax_SVG .MJX-monospace {font-family: monospace}
.MathJax_SVG .MJX-sans-serif {font-family: sans-serif}
.MathJax_SVG {display: inline; font-style: normal; font-weight: normal; line-height: normal; font-size: 100%; font-size-adjust: none; text-indent: 0; text-align: left; text-transform: none; letter-spacing: normal; word-spacing: normal; word-wrap: normal; white-space: nowrap; float: none; direction: ltr; max-width: none; max-height: none; min-width: 0; min-height: 0; border: 0; padding: 0; margin: 0}
.MathJax_SVG * {transition: none; -webkit-transition: none; -moz-transition: none; -ms-transition: none; -o-transition: none}
.mjx-svg-href {fill: blue; stroke: blue}
.MathJax_SVG_LineBox {display: table!important}
.MathJax_SVG_LineBox span {display: table-cell!important; width: 10000em!important; min-width: 0; max-width: none; padding: 0; border: 0; margin: 0}
</style><svg style="display: none;"><defs id="MathJax_SVG_glyphs"></defs></svg><p>Given a <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id="MathJax-Element-1-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink" width="5.165ex" height="2.176ex" style="vertical-align: -0.338ex;" viewBox="0 -791.3 2223.9 936.9" role="img" focusable="false"><g stroke="currentColor" fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path stroke-width="1" d="M42 313Q42 476 123 571T303 666Q372 666 402 630T432 550Q432 525 418 510T379 495Q356 495 341 509T326 548Q326 592 373 601Q351 623 311 626Q240 626 194 566Q147 500 147 364L148 360Q153 366 156 373Q197 433 263 433H267Q313 433 348 414Q372 400 396 374T435 317Q456 268 456 210V192Q456 169 451 149Q440 90 387 34T253 -22Q225 -22 199 -14T143 16T92 75T56 172T42 313ZM257 397Q227 397 205 380T171 335T154 278T148 216Q148 133 160 97T198 39Q222 21 251 21Q302 21 329 59Q342 77 347 104T352 209Q352 289 347 316T329 361Q302 397 257 397Z"></path><g transform="translate(722,0)"><path stroke-width="1" d="M630 29Q630 9 609 9Q604 9 587 25T493 118L389 222L284 117Q178 13 175 11Q171 9 168 9Q160 9 154 15T147 29Q147 36 161 51T255 146L359 250L255 354Q174 435 161 449T147 471Q147 480 153 485T168 490Q173 490 175 489Q178 487 284 383L389 278L493 382Q570 459 587 475T609 491Q630 491 630 471Q630 464 620 453T522 355L418 250L522 145Q606 61 618 48T630 29Z"></path></g><g transform="translate(1723,0)"><path stroke-width="1" d="M42 313Q42 476 123 571T303 666Q372 666 402 630T432 550Q432 525 418 510T379 495Q356 495 341 509T326 548Q326 592 373 601Q351 623 311 626Q240 626 194 566Q147 500 147 364L148 360Q153 366 156 373Q197 433 263 433H267Q313 433 348 414Q372 400 396 374T435 317Q456 268 456 210V192Q456 169 451 149Q440 90 387 34T253 -22Q225 -22 199 -14T143 16T92 75T56 172T42 313ZM257 397Q227 397 205 380T171 335T154 278T148 216Q148 133 160 97T198 39Q222 21 251 21Q302 21 329 59Q342 77 347 104T352 209Q352 289 347 316T329 361Q302 397 257 397Z"></path></g></g></svg></span> <em>2D Array</em>, <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id="MathJax-Element-2-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink" width="3.327ex" height="1.676ex" style="vertical-align: -0.338ex;" viewBox="0 -576.1 1432.5 721.6" role="img" focusable="false"><g stroke="currentColor" fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path stroke-width="1" d="M33 157Q33 258 109 349T280 441Q331 441 370 392Q386 422 416 422Q429 422 439 414T449 394Q449 381 412 234T374 68Q374 43 381 35T402 26Q411 27 422 35Q443 55 463 131Q469 151 473 152Q475 153 483 153H487Q506 153 506 144Q506 138 501 117T481 63T449 13Q436 0 417 -8Q409 -10 393 -10Q359 -10 336 5T306 36L300 51Q299 52 296 50Q294 48 292 46Q233 -10 172 -10Q117 -10 75 30T33 157ZM351 328Q351 334 346 350T323 385T277 405Q242 405 210 374T160 293Q131 214 119 129Q119 126 119 118T118 106Q118 61 136 44T179 26Q217 26 254 59T298 110Q300 114 325 217T351 328Z"></path><g transform="translate(529,0)"><path stroke-width="1" d="M21 287Q22 290 23 295T28 317T38 348T53 381T73 411T99 433T132 442Q161 442 183 430T214 408T225 388Q227 382 228 382T236 389Q284 441 347 441H350Q398 441 422 400Q430 381 430 363Q430 333 417 315T391 292T366 288Q346 288 334 299T322 328Q322 376 378 392Q356 405 342 405Q286 405 239 331Q229 315 224 298T190 165Q156 25 151 16Q138 -11 108 -11Q95 -11 87 -5T76 7T74 17Q74 30 114 189T154 366Q154 405 128 405Q107 405 92 377T68 316T57 280Q55 278 41 278H27Q21 284 21 287Z"></path></g><g transform="translate(981,0)"><path stroke-width="1" d="M21 287Q22 290 23 295T28 317T38 348T53 381T73 411T99 433T132 442Q161 442 183 430T214 408T225 388Q227 382 228 382T236 389Q284 441 347 441H350Q398 441 422 400Q430 381 430 363Q430 333 417 315T391 292T366 288Q346 288 334 299T322 328Q322 376 378 392Q356 405 342 405Q286 405 239 331Q229 315 224 298T190 165Q156 25 151 16Q138 -11 108 -11Q95 -11 87 -5T76 7T74 17Q74 30 114 189T154 366Q154 405 128 405Q107 405 92 377T68 316T57 280Q55 278 41 278H27Q21 284 21 287Z"></path></g></g></svg></span>: </p>

<pre><code>1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
</code></pre>

<p>We define an hourglass in <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id="MathJax-Element-3-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink" width="1.743ex" height="2.176ex" style="vertical-align: -0.338ex;" viewBox="0 -791.3 750.5 936.9" role="img" focusable="false"><g stroke="currentColor" fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path stroke-width="1" d="M208 74Q208 50 254 46Q272 46 272 35Q272 34 270 22Q267 8 264 4T251 0Q249 0 239 0T205 1T141 2Q70 2 50 0H42Q35 7 35 11Q37 38 48 46H62Q132 49 164 96Q170 102 345 401T523 704Q530 716 547 716H555H572Q578 707 578 706L606 383Q634 60 636 57Q641 46 701 46Q726 46 726 36Q726 34 723 22Q720 7 718 4T704 0Q701 0 690 0T651 1T578 2Q484 2 455 0H443Q437 6 437 9T439 27Q443 40 445 43L449 46H469Q523 49 533 63L521 213H283L249 155Q208 86 208 74ZM516 260Q516 271 504 416T490 562L463 519Q447 492 400 412L310 260L413 259Q516 259 516 260Z"></path></g></svg></span> to be a subset of values with indices falling in this pattern in <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id="MathJax-Element-4-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink" width="3.327ex" height="1.676ex" style="vertical-align: -0.338ex;" viewBox="0 -576.1 1432.5 721.6" role="img" focusable="false"><g stroke="currentColor" fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path stroke-width="1" d="M33 157Q33 258 109 349T280 441Q331 441 370 392Q386 422 416 422Q429 422 439 414T449 394Q449 381 412 234T374 68Q374 43 381 35T402 26Q411 27 422 35Q443 55 463 131Q469 151 473 152Q475 153 483 153H487Q506 153 506 144Q506 138 501 117T481 63T449 13Q436 0 417 -8Q409 -10 393 -10Q359 -10 336 5T306 36L300 51Q299 52 296 50Q294 48 292 46Q233 -10 172 -10Q117 -10 75 30T33 157ZM351 328Q351 334 346 350T323 385T277 405Q242 405 210 374T160 293Q131 214 119 129Q119 126 119 118T118 106Q118 61 136 44T179 26Q217 26 254 59T298 110Q300 114 325 217T351 328Z"></path><g transform="translate(529,0)"><path stroke-width="1" d="M21 287Q22 290 23 295T28 317T38 348T53 381T73 411T99 433T132 442Q161 442 183 430T214 408T225 388Q227 382 228 382T236 389Q284 441 347 441H350Q398 441 422 400Q430 381 430 363Q430 333 417 315T391 292T366 288Q346 288 334 299T322 328Q322 376 378 392Q356 405 342 405Q286 405 239 331Q229 315 224 298T190 165Q156 25 151 16Q138 -11 108 -11Q95 -11 87 -5T76 7T74 17Q74 30 114 189T154 366Q154 405 128 405Q107 405 92 377T68 316T57 280Q55 278 41 278H27Q21 284 21 287Z"></path></g><g transform="translate(981,0)"><path stroke-width="1" d="M21 287Q22 290 23 295T28 317T38 348T53 381T73 411T99 433T132 442Q161 442 183 430T214 408T225 388Q227 382 228 382T236 389Q284 441 347 441H350Q398 441 422 400Q430 381 430 363Q430 333 417 315T391 292T366 288Q346 288 334 299T322 328Q322 376 378 392Q356 405 342 405Q286 405 239 331Q229 315 224 298T190 165Q156 25 151 16Q138 -11 108 -11Q95 -11 87 -5T76 7T74 17Q74 30 114 189T154 366Q154 405 128 405Q107 405 92 377T68 316T57 280Q55 278 41 278H27Q21 284 21 287Z"></path></g></g></svg></span>'s graphical representation:</p>

<pre><code>a b c
  d
e f g
</code></pre>

<p>There are <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id="MathJax-Element-5-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink" width="2.325ex" height="2.176ex" style="vertical-align: -0.338ex;" viewBox="0 -791.3 1001 936.9" role="img" focusable="false"><g stroke="currentColor" fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path stroke-width="1" d="M213 578L200 573Q186 568 160 563T102 556H83V602H102Q149 604 189 617T245 641T273 663Q275 666 285 666Q294 666 302 660V361L303 61Q310 54 315 52T339 48T401 46H427V0H416Q395 3 257 3Q121 3 100 0H88V46H114Q136 46 152 46T177 47T193 50T201 52T207 57T213 61V578Z"></path><path stroke-width="1" d="M42 313Q42 476 123 571T303 666Q372 666 402 630T432 550Q432 525 418 510T379 495Q356 495 341 509T326 548Q326 592 373 601Q351 623 311 626Q240 626 194 566Q147 500 147 364L148 360Q153 366 156 373Q197 433 263 433H267Q313 433 348 414Q372 400 396 374T435 317Q456 268 456 210V192Q456 169 451 149Q440 90 387 34T253 -22Q225 -22 199 -14T143 16T92 75T56 172T42 313ZM257 397Q227 397 205 380T171 335T154 278T148 216Q148 133 160 97T198 39Q222 21 251 21Q302 21 329 59Q342 77 347 104T352 209Q352 289 347 316T329 361Q302 397 257 397Z" transform="translate(500,0)"></path></g></svg></span> hourglasses in <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id="MathJax-Element-6-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink" width="3.327ex" height="1.676ex" style="vertical-align: -0.338ex;" viewBox="0 -576.1 1432.5 721.6" role="img" focusable="false"><g stroke="currentColor" fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path stroke-width="1" d="M33 157Q33 258 109 349T280 441Q331 441 370 392Q386 422 416 422Q429 422 439 414T449 394Q449 381 412 234T374 68Q374 43 381 35T402 26Q411 27 422 35Q443 55 463 131Q469 151 473 152Q475 153 483 153H487Q506 153 506 144Q506 138 501 117T481 63T449 13Q436 0 417 -8Q409 -10 393 -10Q359 -10 336 5T306 36L300 51Q299 52 296 50Q294 48 292 46Q233 -10 172 -10Q117 -10 75 30T33 157ZM351 328Q351 334 346 350T323 385T277 405Q242 405 210 374T160 293Q131 214 119 129Q119 126 119 118T118 106Q118 61 136 44T179 26Q217 26 254 59T298 110Q300 114 325 217T351 328Z"></path><g transform="translate(529,0)"><path stroke-width="1" d="M21 287Q22 290 23 295T28 317T38 348T53 381T73 411T99 433T132 442Q161 442 183 430T214 408T225 388Q227 382 228 382T236 389Q284 441 347 441H350Q398 441 422 400Q430 381 430 363Q430 333 417 315T391 292T366 288Q346 288 334 299T322 328Q322 376 378 392Q356 405 342 405Q286 405 239 331Q229 315 224 298T190 165Q156 25 151 16Q138 -11 108 -11Q95 -11 87 -5T76 7T74 17Q74 30 114 189T154 366Q154 405 128 405Q107 405 92 377T68 316T57 280Q55 278 41 278H27Q21 284 21 287Z"></path></g><g transform="translate(981,0)"><path stroke-width="1" d="M21 287Q22 290 23 295T28 317T38 348T53 381T73 411T99 433T132 442Q161 442 183 430T214 408T225 388Q227 382 228 382T236 389Q284 441 347 441H350Q398 441 422 400Q430 381 430 363Q430 333 417 315T391 292T366 288Q346 288 334 299T322 328Q322 376 378 392Q356 405 342 405Q286 405 239 331Q229 315 224 298T190 165Q156 25 151 16Q138 -11 108 -11Q95 -11 87 -5T76 7T74 17Q74 30 114 189T154 366Q154 405 128 405Q107 405 92 377T68 316T57 280Q55 278 41 278H27Q21 284 21 287Z"></path></g></g></svg></span>, and an <em>hourglass sum</em> is the sum of an hourglass' values. Calculate the hourglass sum for every hourglass in <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id="MathJax-Element-7-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink" width="3.327ex" height="1.676ex" style="vertical-align: -0.338ex;" viewBox="0 -576.1 1432.5 721.6" role="img" focusable="false"><g stroke="currentColor" fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path stroke-width="1" d="M33 157Q33 258 109 349T280 441Q331 441 370 392Q386 422 416 422Q429 422 439 414T449 394Q449 381 412 234T374 68Q374 43 381 35T402 26Q411 27 422 35Q443 55 463 131Q469 151 473 152Q475 153 483 153H487Q506 153 506 144Q506 138 501 117T481 63T449 13Q436 0 417 -8Q409 -10 393 -10Q359 -10 336 5T306 36L300 51Q299 52 296 50Q294 48 292 46Q233 -10 172 -10Q117 -10 75 30T33 157ZM351 328Q351 334 346 350T323 385T277 405Q242 405 210 374T160 293Q131 214 119 129Q119 126 119 118T118 106Q118 61 136 44T179 26Q217 26 254 59T298 110Q300 114 325 217T351 328Z"></path><g transform="translate(529,0)"><path stroke-width="1" d="M21 287Q22 290 23 295T28 317T38 348T53 381T73 411T99 433T132 442Q161 442 183 430T214 408T225 388Q227 382 228 382T236 389Q284 441 347 441H350Q398 441 422 400Q430 381 430 363Q430 333 417 315T391 292T366 288Q346 288 334 299T322 328Q322 376 378 392Q356 405 342 405Q286 405 239 331Q229 315 224 298T190 165Q156 25 151 16Q138 -11 108 -11Q95 -11 87 -5T76 7T74 17Q74 30 114 189T154 366Q154 405 128 405Q107 405 92 377T68 316T57 280Q55 278 41 278H27Q21 284 21 287Z"></path></g><g transform="translate(981,0)"><path stroke-width="1" d="M21 287Q22 290 23 295T28 317T38 348T53 381T73 411T99 433T132 442Q161 442 183 430T214 408T225 388Q227 382 228 382T236 389Q284 441 347 441H350Q398 441 422 400Q430 381 430 363Q430 333 417 315T391 292T366 288Q346 288 334 299T322 328Q322 376 378 392Q356 405 342 405Q286 405 239 331Q229 315 224 298T190 165Q156 25 151 16Q138 -11 108 -11Q95 -11 87 -5T76 7T74 17Q74 30 114 189T154 366Q154 405 128 405Q107 405 92 377T68 316T57 280Q55 278 41 278H27Q21 284 21 287Z"></path></g></g></svg></span>, then print the <em>maximum</em> hourglass sum.</p>

<p>For example, given the 2D array:</p>

<pre><code>-9 -9 -9  1 1 1 
 0 -9  0  4 3 2
-9 -9 -9  1 2 3
 0  0  8  6 6 0
 0  0  0 -2 0 0
 0  0  1  2 4 0
</code></pre>

<p>We calculate the following <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id="MathJax-Element-8-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink" width="2.325ex" height="2.176ex" style="vertical-align: -0.338ex;" viewBox="0 -791.3 1001 936.9" role="img" focusable="false"><g stroke="currentColor" fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path stroke-width="1" d="M213 578L200 573Q186 568 160 563T102 556H83V602H102Q149 604 189 617T245 641T273 663Q275 666 285 666Q294 666 302 660V361L303 61Q310 54 315 52T339 48T401 46H427V0H416Q395 3 257 3Q121 3 100 0H88V46H114Q136 46 152 46T177 47T193 50T201 52T207 57T213 61V578Z"></path><path stroke-width="1" d="M42 313Q42 476 123 571T303 666Q372 666 402 630T432 550Q432 525 418 510T379 495Q356 495 341 509T326 548Q326 592 373 601Q351 623 311 626Q240 626 194 566Q147 500 147 364L148 360Q153 366 156 373Q197 433 263 433H267Q313 433 348 414Q372 400 396 374T435 317Q456 268 456 210V192Q456 169 451 149Q440 90 387 34T253 -22Q225 -22 199 -14T143 16T92 75T56 172T42 313ZM257 397Q227 397 205 380T171 335T154 278T148 216Q148 133 160 97T198 39Q222 21 251 21Q302 21 329 59Q342 77 347 104T352 209Q352 289 347 316T329 361Q302 397 257 397Z" transform="translate(500,0)"></path></g></svg></span> hourglass values:</p>

<pre><code>-63, -34, -9, 12, 
-10, 0, 28, 23, 
-27, -11, -2, 10, 
9, 17, 25, 18
</code></pre>

<p>Our highest hourglass value is <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id="MathJax-Element-9-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink" width="2.325ex" height="2.176ex" style="vertical-align: -0.338ex;" viewBox="0 -791.3 1001 936.9" role="img" focusable="false"><g stroke="currentColor" fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path stroke-width="1" d="M109 429Q82 429 66 447T50 491Q50 562 103 614T235 666Q326 666 387 610T449 465Q449 422 429 383T381 315T301 241Q265 210 201 149L142 93L218 92Q375 92 385 97Q392 99 409 186V189H449V186Q448 183 436 95T421 3V0H50V19V31Q50 38 56 46T86 81Q115 113 136 137Q145 147 170 174T204 211T233 244T261 278T284 308T305 340T320 369T333 401T340 431T343 464Q343 527 309 573T212 619Q179 619 154 602T119 569T109 550Q109 549 114 549Q132 549 151 535T170 489Q170 464 154 447T109 429Z"></path><path stroke-width="1" d="M70 417T70 494T124 618T248 666Q319 666 374 624T429 515Q429 485 418 459T392 417T361 389T335 371T324 363L338 354Q352 344 366 334T382 323Q457 264 457 174Q457 95 399 37T249 -22Q159 -22 101 29T43 155Q43 263 172 335L154 348Q133 361 127 368Q70 417 70 494ZM286 386L292 390Q298 394 301 396T311 403T323 413T334 425T345 438T355 454T364 471T369 491T371 513Q371 556 342 586T275 624Q268 625 242 625Q201 625 165 599T128 534Q128 511 141 492T167 463T217 431Q224 426 228 424L286 386ZM250 21Q308 21 350 55T392 137Q392 154 387 169T375 194T353 216T330 234T301 253T274 270Q260 279 244 289T218 306L210 311Q204 311 181 294T133 239T107 157Q107 98 150 60T250 21Z" transform="translate(500,0)"></path></g></svg></span> from the hourglass:</p>

<pre><code>0 4 3
  1
8 6 6
</code></pre>

<p><strong>Note:</strong> If you have already solved the Java domain's <em>Java 2D Array</em> challenge, you may wish to skip this challenge.</p>

<p><strong>Function Description</strong></p>

<p>Complete the function <em>hourglassSum</em> in the editor below.  It should return an integer, the maximum hourglass sum in the array.  </p>

<p>hourglassSum has the following parameter(s):</p>

<ul>
<li><em>arr</em>: an array of integers </li>
</ul></div></div></div><div class="challenge_input_format"><div class="msB challenge_input_format_title"><p><strong>Input Format</strong></p></div><div class="msB challenge_input_format_body"><div class="hackdown-content"><style id="MathJax_SVG_styles">.MathJax_SVG_Display {text-align: center; margin: 1em 0em; position: relative; display: block!important; text-indent: 0; max-width: none; max-height: none; min-width: 0; min-height: 0; width: 100%}
.MathJax_SVG .MJX-monospace {font-family: monospace}
.MathJax_SVG .MJX-sans-serif {font-family: sans-serif}
.MathJax_SVG {display: inline; font-style: normal; font-weight: normal; line-height: normal; font-size: 100%; font-size-adjust: none; text-indent: 0; text-align: left; text-transform: none; letter-spacing: normal; word-spacing: normal; word-wrap: normal; white-space: nowrap; float: none; direction: ltr; max-width: none; max-height: none; min-width: 0; min-height: 0; border: 0; padding: 0; margin: 0}
.MathJax_SVG * {transition: none; -webkit-transition: none; -moz-transition: none; -ms-transition: none; -o-transition: none}
.mjx-svg-href {fill: blue; stroke: blue}
.MathJax_SVG_LineBox {display: table!important}
.MathJax_SVG_LineBox span {display: table-cell!important; width: 10000em!important; min-width: 0; max-width: none; padding: 0; border: 0; margin: 0}
</style><svg style="display: none;"><defs id="MathJax_SVG_glyphs"></defs></svg><p>Each of the <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id="MathJax-Element-1-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink" width="1.162ex" height="2.176ex" style="vertical-align: -0.338ex;" viewBox="0 -791.3 500.5 936.9" role="img" focusable="false"><g stroke="currentColor" fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path stroke-width="1" d="M42 313Q42 476 123 571T303 666Q372 666 402 630T432 550Q432 525 418 510T379 495Q356 495 341 509T326 548Q326 592 373 601Q351 623 311 626Q240 626 194 566Q147 500 147 364L148 360Q153 366 156 373Q197 433 263 433H267Q313 433 348 414Q372 400 396 374T435 317Q456 268 456 210V192Q456 169 451 149Q440 90 387 34T253 -22Q225 -22 199 -14T143 16T92 75T56 172T42 313ZM257 397Q227 397 205 380T171 335T154 278T148 216Q148 133 160 97T198 39Q222 21 251 21Q302 21 329 59Q342 77 347 104T352 209Q352 289 347 316T329 361Q302 397 257 397Z"></path></g></svg></span> lines of inputs <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id="MathJax-Element-2-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink" width="5.423ex" height="2.843ex" style="vertical-align: -0.838ex;" viewBox="0 -863.1 2335 1223.9" role="img" focusable="false"><g stroke="currentColor" fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path stroke-width="1" d="M33 157Q33 258 109 349T280 441Q331 441 370 392Q386 422 416 422Q429 422 439 414T449 394Q449 381 412 234T374 68Q374 43 381 35T402 26Q411 27 422 35Q443 55 463 131Q469 151 473 152Q475 153 483 153H487Q506 153 506 144Q506 138 501 117T481 63T449 13Q436 0 417 -8Q409 -10 393 -10Q359 -10 336 5T306 36L300 51Q299 52 296 50Q294 48 292 46Q233 -10 172 -10Q117 -10 75 30T33 157ZM351 328Q351 334 346 350T323 385T277 405Q242 405 210 374T160 293Q131 214 119 129Q119 126 119 118T118 106Q118 61 136 44T179 26Q217 26 254 59T298 110Q300 114 325 217T351 328Z"></path><g transform="translate(529,0)"><path stroke-width="1" d="M21 287Q22 290 23 295T28 317T38 348T53 381T73 411T99 433T132 442Q161 442 183 430T214 408T225 388Q227 382 228 382T236 389Q284 441 347 441H350Q398 441 422 400Q430 381 430 363Q430 333 417 315T391 292T366 288Q346 288 334 299T322 328Q322 376 378 392Q356 405 342 405Q286 405 239 331Q229 315 224 298T190 165Q156 25 151 16Q138 -11 108 -11Q95 -11 87 -5T76 7T74 17Q74 30 114 189T154 366Q154 405 128 405Q107 405 92 377T68 316T57 280Q55 278 41 278H27Q21 284 21 287Z"></path></g><g transform="translate(981,0)"><path stroke-width="1" d="M21 287Q22 290 23 295T28 317T38 348T53 381T73 411T99 433T132 442Q161 442 183 430T214 408T225 388Q227 382 228 382T236 389Q284 441 347 441H350Q398 441 422 400Q430 381 430 363Q430 333 417 315T391 292T366 288Q346 288 334 299T322 328Q322 376 378 392Q356 405 342 405Q286 405 239 331Q229 315 224 298T190 165Q156 25 151 16Q138 -11 108 -11Q95 -11 87 -5T76 7T74 17Q74 30 114 189T154 366Q154 405 128 405Q107 405 92 377T68 316T57 280Q55 278 41 278H27Q21 284 21 287Z"></path></g><g transform="translate(1432,0)"><path stroke-width="1" d="M118 -250V750H255V710H158V-210H255V-250H118Z"></path></g><g transform="translate(1711,0)"><path stroke-width="1" d="M184 600Q184 624 203 642T247 661Q265 661 277 649T290 619Q290 596 270 577T226 557Q211 557 198 567T184 600ZM21 287Q21 295 30 318T54 369T98 420T158 442Q197 442 223 419T250 357Q250 340 236 301T196 196T154 83Q149 61 149 51Q149 26 166 26Q175 26 185 29T208 43T235 78T260 137Q263 149 265 151T282 153Q302 153 302 143Q302 135 293 112T268 61T223 11T161 -11Q129 -11 102 10T74 74Q74 91 79 106T122 220Q160 321 166 341T173 380Q173 404 156 404H154Q124 404 99 371T61 287Q60 286 59 284T58 281T56 279T53 278T49 278T41 278H27Q21 284 21 287Z"></path></g><g transform="translate(2056,0)"><path stroke-width="1" d="M22 710V750H159V-250H22V-210H119V710H22Z"></path></g></g></svg></span> contains <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id="MathJax-Element-3-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink" width="1.162ex" height="2.176ex" style="vertical-align: -0.338ex;" viewBox="0 -791.3 500.5 936.9" role="img" focusable="false"><g stroke="currentColor" fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path stroke-width="1" d="M42 313Q42 476 123 571T303 666Q372 666 402 630T432 550Q432 525 418 510T379 495Q356 495 341 509T326 548Q326 592 373 601Q351 623 311 626Q240 626 194 566Q147 500 147 364L148 360Q153 366 156 373Q197 433 263 433H267Q313 433 348 414Q372 400 396 374T435 317Q456 268 456 210V192Q456 169 451 149Q440 90 387 34T253 -22Q225 -22 199 -14T143 16T92 75T56 172T42 313ZM257 397Q227 397 205 380T171 335T154 278T148 216Q148 133 160 97T198 39Q222 21 251 21Q302 21 329 59Q342 77 347 104T352 209Q352 289 347 316T329 361Q302 397 257 397Z"></path></g></svg></span> space-separated integers <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id="MathJax-Element-4-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink" width="7.675ex" height="2.843ex" style="vertical-align: -0.838ex;" viewBox="0 -863.1 3304.5 1223.9" role="img" focusable="false"><g stroke="currentColor" fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path stroke-width="1" d="M33 157Q33 258 109 349T280 441Q331 441 370 392Q386 422 416 422Q429 422 439 414T449 394Q449 381 412 234T374 68Q374 43 381 35T402 26Q411 27 422 35Q443 55 463 131Q469 151 473 152Q475 153 483 153H487Q506 153 506 144Q506 138 501 117T481 63T449 13Q436 0 417 -8Q409 -10 393 -10Q359 -10 336 5T306 36L300 51Q299 52 296 50Q294 48 292 46Q233 -10 172 -10Q117 -10 75 30T33 157ZM351 328Q351 334 346 350T323 385T277 405Q242 405 210 374T160 293Q131 214 119 129Q119 126 119 118T118 106Q118 61 136 44T179 26Q217 26 254 59T298 110Q300 114 325 217T351 328Z"></path><g transform="translate(529,0)"><path stroke-width="1" d="M21 287Q22 290 23 295T28 317T38 348T53 381T73 411T99 433T132 442Q161 442 183 430T214 408T225 388Q227 382 228 382T236 389Q284 441 347 441H350Q398 441 422 400Q430 381 430 363Q430 333 417 315T391 292T366 288Q346 288 334 299T322 328Q322 376 378 392Q356 405 342 405Q286 405 239 331Q229 315 224 298T190 165Q156 25 151 16Q138 -11 108 -11Q95 -11 87 -5T76 7T74 17Q74 30 114 189T154 366Q154 405 128 405Q107 405 92 377T68 316T57 280Q55 278 41 278H27Q21 284 21 287Z"></path></g><g transform="translate(981,0)"><path stroke-width="1" d="M21 287Q22 290 23 295T28 317T38 348T53 381T73 411T99 433T132 442Q161 442 183 430T214 408T225 388Q227 382 228 382T236 389Q284 441 347 441H350Q398 441 422 400Q430 381 430 363Q430 333 417 315T391 292T366 288Q346 288 334 299T322 328Q322 376 378 392Q356 405 342 405Q286 405 239 331Q229 315 224 298T190 165Q156 25 151 16Q138 -11 108 -11Q95 -11 87 -5T76 7T74 17Q74 30 114 189T154 366Q154 405 128 405Q107 405 92 377T68 316T57 280Q55 278 41 278H27Q21 284 21 287Z"></path></g><g transform="translate(1432,0)"><path stroke-width="1" d="M118 -250V750H255V710H158V-210H255V-250H118Z"></path></g><g transform="translate(1711,0)"><path stroke-width="1" d="M184 600Q184 624 203 642T247 661Q265 661 277 649T290 619Q290 596 270 577T226 557Q211 557 198 567T184 600ZM21 287Q21 295 30 318T54 369T98 420T158 442Q197 442 223 419T250 357Q250 340 236 301T196 196T154 83Q149 61 149 51Q149 26 166 26Q175 26 185 29T208 43T235 78T260 137Q263 149 265 151T282 153Q302 153 302 143Q302 135 293 112T268 61T223 11T161 -11Q129 -11 102 10T74 74Q74 91 79 106T122 220Q160 321 166 341T173 380Q173 404 156 404H154Q124 404 99 371T61 287Q60 286 59 284T58 281T56 279T53 278T49 278T41 278H27Q21 284 21 287Z"></path></g><g transform="translate(2056,0)"><path stroke-width="1" d="M22 710V750H159V-250H22V-210H119V710H22Z"></path></g><g transform="translate(2335,0)"><path stroke-width="1" d="M118 -250V750H255V710H158V-210H255V-250H118Z"></path></g><g transform="translate(2613,0)"><path stroke-width="1" d="M297 596Q297 627 318 644T361 661Q378 661 389 651T403 623Q403 595 384 576T340 557Q322 557 310 567T297 596ZM288 376Q288 405 262 405Q240 405 220 393T185 362T161 325T144 293L137 279Q135 278 121 278H107Q101 284 101 286T105 299Q126 348 164 391T252 441Q253 441 260 441T272 442Q296 441 316 432Q341 418 354 401T367 348V332L318 133Q267 -67 264 -75Q246 -125 194 -164T75 -204Q25 -204 7 -183T-12 -137Q-12 -110 7 -91T53 -71Q70 -71 82 -81T95 -112Q95 -148 63 -167Q69 -168 77 -168Q111 -168 139 -140T182 -74L193 -32Q204 11 219 72T251 197T278 308T289 365Q289 372 288 376Z"></path></g><g transform="translate(3026,0)"><path stroke-width="1" d="M22 710V750H159V-250H22V-210H119V710H22Z"></path></g></g></svg></span>.</p></div></div></div><div class="challenge_constraints"><div class="msB challenge_constraints_title"><p><strong>Constraints</strong></p></div><div class="msB challenge_constraints_body"><div class="hackdown-content"><style id="MathJax_SVG_styles">.MathJax_SVG_Display {text-align: center; margin: 1em 0em; position: relative; display: block!important; text-indent: 0; max-width: none; max-height: none; min-width: 0; min-height: 0; width: 100%}
.MathJax_SVG .MJX-monospace {font-family: monospace}
.MathJax_SVG .MJX-sans-serif {font-family: sans-serif}
.MathJax_SVG {display: inline; font-style: normal; font-weight: normal; line-height: normal; font-size: 100%; font-size-adjust: none; text-indent: 0; text-align: left; text-transform: none; letter-spacing: normal; word-spacing: normal; word-wrap: normal; white-space: nowrap; float: none; direction: ltr; max-width: none; max-height: none; min-width: 0; min-height: 0; border: 0; padding: 0; margin: 0}
.MathJax_SVG * {transition: none; -webkit-transition: none; -moz-transition: none; -ms-transition: none; -o-transition: none}
.mjx-svg-href {fill: blue; stroke: blue}
.MathJax_SVG_LineBox {display: table!important}
.MathJax_SVG_LineBox span {display: table-cell!important; width: 10000em!important; min-width: 0; max-width: none; padding: 0; border: 0; margin: 0}
</style><svg style="display: none;"><defs id="MathJax_SVG_glyphs"></defs></svg><ul>
<li><span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id="MathJax-Element-1-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink" width="18.005ex" height="2.843ex" style="vertical-align: -0.838ex;" viewBox="0 -863.1 7752.1 1223.9" role="img" focusable="false"><g stroke="currentColor" fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path stroke-width="1" d="M84 237T84 250T98 270H679Q694 262 694 250T679 230H98Q84 237 84 250Z"></path><g transform="translate(778,0)"><path stroke-width="1" d="M352 287Q304 211 232 211Q154 211 104 270T44 396Q42 412 42 436V444Q42 537 111 606Q171 666 243 666Q245 666 249 666T257 665H261Q273 665 286 663T323 651T370 619T413 560Q456 472 456 334Q456 194 396 97Q361 41 312 10T208 -22Q147 -22 108 7T68 93T121 149Q143 149 158 135T173 96Q173 78 164 65T148 49T135 44L131 43Q131 41 138 37T164 27T206 22H212Q272 22 313 86Q352 142 352 280V287ZM244 248Q292 248 321 297T351 430Q351 508 343 542Q341 552 337 562T323 588T293 615T246 625Q208 625 181 598Q160 576 154 546T147 441Q147 358 152 329T172 282Q197 248 244 248Z"></path></g><g transform="translate(1556,0)"><path stroke-width="1" d="M674 636Q682 636 688 630T694 615T687 601Q686 600 417 472L151 346L399 228Q687 92 691 87Q694 81 694 76Q694 58 676 56H670L382 192Q92 329 90 331Q83 336 83 348Q84 359 96 365Q104 369 382 500T665 634Q669 636 674 636ZM84 -118Q84 -108 99 -98H678Q694 -104 694 -118Q694 -130 679 -138H98Q84 -131 84 -118Z"></path></g><g transform="translate(2613,0)"><path stroke-width="1" d="M33 157Q33 258 109 349T280 441Q331 441 370 392Q386 422 416 422Q429 422 439 414T449 394Q449 381 412 234T374 68Q374 43 381 35T402 26Q411 27 422 35Q443 55 463 131Q469 151 473 152Q475 153 483 153H487Q506 153 506 144Q506 138 501 117T481 63T449 13Q436 0 417 -8Q409 -10 393 -10Q359 -10 336 5T306 36L300 51Q299 52 296 50Q294 48 292 46Q233 -10 172 -10Q117 -10 75 30T33 157ZM351 328Q351 334 346 350T323 385T277 405Q242 405 210 374T160 293Q131 214 119 129Q119 126 119 118T118 106Q118 61 136 44T179 26Q217 26 254 59T298 110Q300 114 325 217T351 328Z"></path></g><g transform="translate(3142,0)"><path stroke-width="1" d="M21 287Q22 290 23 295T28 317T38 348T53 381T73 411T99 433T132 442Q161 442 183 430T214 408T225 388Q227 382 228 382T236 389Q284 441 347 441H350Q398 441 422 400Q430 381 430 363Q430 333 417 315T391 292T366 288Q346 288 334 299T322 328Q322 376 378 392Q356 405 342 405Q286 405 239 331Q229 315 224 298T190 165Q156 25 151 16Q138 -11 108 -11Q95 -11 87 -5T76 7T74 17Q74 30 114 189T154 366Q154 405 128 405Q107 405 92 377T68 316T57 280Q55 278 41 278H27Q21 284 21 287Z"></path></g><g transform="translate(3594,0)"><path stroke-width="1" d="M21 287Q22 290 23 295T28 317T38 348T53 381T73 411T99 433T132 442Q161 442 183 430T214 408T225 388Q227 382 228 382T236 389Q284 441 347 441H350Q398 441 422 400Q430 381 430 363Q430 333 417 315T391 292T366 288Q346 288 334 299T322 328Q322 376 378 392Q356 405 342 405Q286 405 239 331Q229 315 224 298T190 165Q156 25 151 16Q138 -11 108 -11Q95 -11 87 -5T76 7T74 17Q74 30 114 189T154 366Q154 405 128 405Q107 405 92 377T68 316T57 280Q55 278 41 278H27Q21 284 21 287Z"></path></g><g transform="translate(4045,0)"><path stroke-width="1" d="M118 -250V750H255V710H158V-210H255V-250H118Z"></path></g><g transform="translate(4324,0)"><path stroke-width="1" d="M184 600Q184 624 203 642T247 661Q265 661 277 649T290 619Q290 596 270 577T226 557Q211 557 198 567T184 600ZM21 287Q21 295 30 318T54 369T98 420T158 442Q197 442 223 419T250 357Q250 340 236 301T196 196T154 83Q149 61 149 51Q149 26 166 26Q175 26 185 29T208 43T235 78T260 137Q263 149 265 151T282 153Q302 153 302 143Q302 135 293 112T268 61T223 11T161 -11Q129 -11 102 10T74 74Q74 91 79 106T122 220Q160 321 166 341T173 380Q173 404 156 404H154Q124 404 99 371T61 287Q60 286 59 284T58 281T56 279T53 278T49 278T41 278H27Q21 284 21 287Z"></path></g><g transform="translate(4669,0)"><path stroke-width="1" d="M22 710V750H159V-250H22V-210H119V710H22Z"></path></g><g transform="translate(4948,0)"><path stroke-width="1" d="M118 -250V750H255V710H158V-210H255V-250H118Z"></path></g><g transform="translate(5226,0)"><path stroke-width="1" d="M297 596Q297 627 318 644T361 661Q378 661 389 651T403 623Q403 595 384 576T340 557Q322 557 310 567T297 596ZM288 376Q288 405 262 405Q240 405 220 393T185 362T161 325T144 293L137 279Q135 278 121 278H107Q101 284 101 286T105 299Q126 348 164 391T252 441Q253 441 260 441T272 442Q296 441 316 432Q341 418 354 401T367 348V332L318 133Q267 -67 264 -75Q246 -125 194 -164T75 -204Q25 -204 7 -183T-12 -137Q-12 -110 7 -91T53 -71Q70 -71 82 -81T95 -112Q95 -148 63 -167Q69 -168 77 -168Q111 -168 139 -140T182 -74L193 -32Q204 11 219 72T251 197T278 308T289 365Q289 372 288 376Z"></path></g><g transform="translate(5639,0)"><path stroke-width="1" d="M22 710V750H159V-250H22V-210H119V710H22Z"></path></g><g transform="translate(6195,0)"><path stroke-width="1" d="M674 636Q682 636 688 630T694 615T687 601Q686 600 417 472L151 346L399 228Q687 92 691 87Q694 81 694 76Q694 58 676 56H670L382 192Q92 329 90 331Q83 336 83 348Q84 359 96 365Q104 369 382 500T665 634Q669 636 674 636ZM84 -118Q84 -108 99 -98H678Q694 -104 694 -118Q694 -130 679 -138H98Q84 -131 84 -118Z"></path></g><g transform="translate(7251,0)"><path stroke-width="1" d="M352 287Q304 211 232 211Q154 211 104 270T44 396Q42 412 42 436V444Q42 537 111 606Q171 666 243 666Q245 666 249 666T257 665H261Q273 665 286 663T323 651T370 619T413 560Q456 472 456 334Q456 194 396 97Q361 41 312 10T208 -22Q147 -22 108 7T68 93T121 149Q143 149 158 135T173 96Q173 78 164 65T148 49T135 44L131 43Q131 41 138 37T164 27T206 22H212Q272 22 313 86Q352 142 352 280V287ZM244 248Q292 248 321 297T351 430Q351 508 343 542Q341 552 337 562T323 588T293 615T246 625Q208 625 181 598Q160 576 154 546T147 441Q147 358 152 329T172 282Q197 248 244 248Z"></path></g></g></svg></span>  </li>
<li><span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id="MathJax-Element-2-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink" width="11.316ex" height="2.509ex" style="vertical-align: -0.671ex;" viewBox="0 -791.3 4872.3 1080.4" role="img" focusable="false"><g stroke="currentColor" fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path stroke-width="1" d="M96 585Q152 666 249 666Q297 666 345 640T423 548Q460 465 460 320Q460 165 417 83Q397 41 362 16T301 -15T250 -22Q224 -22 198 -16T137 16T82 83Q39 165 39 320Q39 494 96 585ZM321 597Q291 629 250 629Q208 629 178 597Q153 571 145 525T137 333Q137 175 145 125T181 46Q209 16 250 16Q290 16 318 46Q347 76 354 130T362 333Q362 478 354 524T321 597Z"></path><g transform="translate(778,0)"><path stroke-width="1" d="M674 636Q682 636 688 630T694 615T687 601Q686 600 417 472L151 346L399 228Q687 92 691 87Q694 81 694 76Q694 58 676 56H670L382 192Q92 329 90 331Q83 336 83 348Q84 359 96 365Q104 369 382 500T665 634Q669 636 674 636ZM84 -118Q84 -108 99 -98H678Q694 -104 694 -118Q694 -130 679 -138H98Q84 -131 84 -118Z"></path></g><g transform="translate(1834,0)"><path stroke-width="1" d="M184 600Q184 624 203 642T247 661Q265 661 277 649T290 619Q290 596 270 577T226 557Q211 557 198 567T184 600ZM21 287Q21 295 30 318T54 369T98 420T158 442Q197 442 223 419T250 357Q250 340 236 301T196 196T154 83Q149 61 149 51Q149 26 166 26Q175 26 185 29T208 43T235 78T260 137Q263 149 265 151T282 153Q302 153 302 143Q302 135 293 112T268 61T223 11T161 -11Q129 -11 102 10T74 74Q74 91 79 106T122 220Q160 321 166 341T173 380Q173 404 156 404H154Q124 404 99 371T61 287Q60 286 59 284T58 281T56 279T53 278T49 278T41 278H27Q21 284 21 287Z"></path></g><g transform="translate(2180,0)"><path stroke-width="1" d="M78 35T78 60T94 103T137 121Q165 121 187 96T210 8Q210 -27 201 -60T180 -117T154 -158T130 -185T117 -194Q113 -194 104 -185T95 -172Q95 -168 106 -156T131 -126T157 -76T173 -3V9L172 8Q170 7 167 6T161 3T152 1T140 0Q113 0 96 17Z"></path></g><g transform="translate(2625,0)"><path stroke-width="1" d="M297 596Q297 627 318 644T361 661Q378 661 389 651T403 623Q403 595 384 576T340 557Q322 557 310 567T297 596ZM288 376Q288 405 262 405Q240 405 220 393T185 362T161 325T144 293L137 279Q135 278 121 278H107Q101 284 101 286T105 299Q126 348 164 391T252 441Q253 441 260 441T272 442Q296 441 316 432Q341 418 354 401T367 348V332L318 133Q267 -67 264 -75Q246 -125 194 -164T75 -204Q25 -204 7 -183T-12 -137Q-12 -110 7 -91T53 -71Q70 -71 82 -81T95 -112Q95 -148 63 -167Q69 -168 77 -168Q111 -168 139 -140T182 -74L193 -32Q204 11 219 72T251 197T278 308T289 365Q289 372 288 376Z"></path></g><g transform="translate(3315,0)"><path stroke-width="1" d="M674 636Q682 636 688 630T694 615T687 601Q686 600 417 472L151 346L399 228Q687 92 691 87Q694 81 694 76Q694 58 676 56H670L382 192Q92 329 90 331Q83 336 83 348Q84 359 96 365Q104 369 382 500T665 634Q669 636 674 636ZM84 -118Q84 -108 99 -98H678Q694 -104 694 -118Q694 -130 679 -138H98Q84 -131 84 -118Z"></path></g><g transform="translate(4371,0)"><path stroke-width="1" d="M164 157Q164 133 148 117T109 101H102Q148 22 224 22Q294 22 326 82Q345 115 345 210Q345 313 318 349Q292 382 260 382H254Q176 382 136 314Q132 307 129 306T114 304Q97 304 95 310Q93 314 93 485V614Q93 664 98 664Q100 666 102 666Q103 666 123 658T178 642T253 634Q324 634 389 662Q397 666 402 666Q410 666 410 648V635Q328 538 205 538Q174 538 149 544L139 546V374Q158 388 169 396T205 412T256 420Q337 420 393 355T449 201Q449 109 385 44T229 -22Q148 -22 99 32T50 154Q50 178 61 192T84 210T107 214Q132 214 148 197T164 157Z"></path></g></g></svg></span></li>
</ul></div></div></div><div class="challenge_output_format"><div class="msB challenge_output_format_title"><p><strong>Output Format</strong></p></div><div class="msB challenge_output_format_body"><div class="hackdown-content"><style id="MathJax_SVG_styles">.MathJax_SVG_Display {text-align: center; margin: 1em 0em; position: relative; display: block!important; text-indent: 0; max-width: none; max-height: none; min-width: 0; min-height: 0; width: 100%}
.MathJax_SVG .MJX-monospace {font-family: monospace}
.MathJax_SVG .MJX-sans-serif {font-family: sans-serif}
.MathJax_SVG {display: inline; font-style: normal; font-weight: normal; line-height: normal; font-size: 100%; font-size-adjust: none; text-indent: 0; text-align: left; text-transform: none; letter-spacing: normal; word-spacing: normal; word-wrap: normal; white-space: nowrap; float: none; direction: ltr; max-width: none; max-height: none; min-width: 0; min-height: 0; border: 0; padding: 0; margin: 0}
.MathJax_SVG * {transition: none; -webkit-transition: none; -moz-transition: none; -ms-transition: none; -o-transition: none}
.mjx-svg-href {fill: blue; stroke: blue}
.MathJax_SVG_LineBox {display: table!important}
.MathJax_SVG_LineBox span {display: table-cell!important; width: 10000em!important; min-width: 0; max-width: none; padding: 0; border: 0; margin: 0}
</style><svg style="display: none;"><defs id="MathJax_SVG_glyphs"></defs></svg><p>Print the largest (maximum) hourglass sum found in <span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id="MathJax-Element-1-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink" width="3.327ex" height="1.676ex" style="vertical-align: -0.338ex;" viewBox="0 -576.1 1432.5 721.6" role="img" focusable="false"><g stroke="currentColor" fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path stroke-width="1" d="M33 157Q33 258 109 349T280 441Q331 441 370 392Q386 422 416 422Q429 422 439 414T449 394Q449 381 412 234T374 68Q374 43 381 35T402 26Q411 27 422 35Q443 55 463 131Q469 151 473 152Q475 153 483 153H487Q506 153 506 144Q506 138 501 117T481 63T449 13Q436 0 417 -8Q409 -10 393 -10Q359 -10 336 5T306 36L300 51Q299 52 296 50Q294 48 292 46Q233 -10 172 -10Q117 -10 75 30T33 157ZM351 328Q351 334 346 350T323 385T277 405Q242 405 210 374T160 293Q131 214 119 129Q119 126 119 118T118 106Q118 61 136 44T179 26Q217 26 254 59T298 110Q300 114 325 217T351 328Z"></path><g transform="translate(529,0)"><path stroke-width="1" d="M21 287Q22 290 23 295T28 317T38 348T53 381T73 411T99 433T132 442Q161 442 183 430T214 408T225 388Q227 382 228 382T236 389Q284 441 347 441H350Q398 441 422 400Q430 381 430 363Q430 333 417 315T391 292T366 288Q346 288 334 299T322 328Q322 376 378 392Q356 405 342 405Q286 405 239 331Q229 315 224 298T190 165Q156 25 151 16Q138 -11 108 -11Q95 -11 87 -5T76 7T74 17Q74 30 114 189T154 366Q154 405 128 405Q107 405 92 377T68 316T57 280Q55 278 41 278H27Q21 284 21 287Z"></path></g><g transform="translate(981,0)"><path stroke-width="1" d="M21 287Q22 290 23 295T28 317T38 348T53 381T73 411T99 433T132 442Q161 442 183 430T214 408T225 388Q227 382 228 382T236 389Q284 441 347 441H350Q398 441 422 400Q430 381 430 363Q430 333 417 315T391 292T366 288Q346 288 334 299T322 328Q322 376 378 392Q356 405 342 405Q286 405 239 331Q229 315 224 298T190 165Q156 25 151 16Q138 -11 108 -11Q95 -11 87 -5T76 7T74 17Q74 30 114 189T154 366Q154 405 128 405Q107 405 92 377T68 316T57 280Q55 278 41 278H27Q21 284 21 287Z"></path></g></g></svg></span>.</p></div></div></div><div class="challenge_sample_input"><div class="msB challenge_sample_input_title"><p><strong>Sample Input</strong></p></div><div class="msB challenge_sample_input_body"><div class="hackdown-content"><style id="MathJax_SVG_styles">.MathJax_SVG_Display {text-align: center; margin: 1em 0em; position: relative; display: block!important; text-indent: 0; max-width: none; max-height: none; min-width: 0; min-height: 0; width: 100%}
.MathJax_SVG .MJX-monospace {font-family: monospace}
.MathJax_SVG .MJX-sans-serif {font-family: sans-serif}
.MathJax_SVG {display: inline; font-style: normal; font-weight: normal; line-height: normal; font-size: 100%; font-size-adjust: none; text-indent: 0; text-align: left; text-transform: none; letter-spacing: normal; word-spacing: normal; word-wrap: normal; white-space: nowrap; float: none; direction: ltr; max-width: none; max-height: none; min-width: 0; min-height: 0; border: 0; padding: 0; margin: 0}
.MathJax_SVG * {transition: none; -webkit-transition: none; -moz-transition: none; -ms-transition: none; -o-transition: none}
.mjx-svg-href {fill: blue; stroke: blue}
</style><svg style="display: none;"><defs id="MathJax_SVG_glyphs"></defs></svg><pre><code>1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
</code></pre></div></div></div><div class="challenge_sample_output"><div class="msB challenge_sample_output_title"><p><strong>Sample Output</strong></p></div><div class="msB challenge_sample_output_body"><div class="hackdown-content"><style id="MathJax_SVG_styles">.MathJax_SVG_Display {text-align: center; margin: 1em 0em; position: relative; display: block!important; text-indent: 0; max-width: none; max-height: none; min-width: 0; min-height: 0; width: 100%}
.MathJax_SVG .MJX-monospace {font-family: monospace}
.MathJax_SVG .MJX-sans-serif {font-family: sans-serif}
.MathJax_SVG {display: inline; font-style: normal; font-weight: normal; line-height: normal; font-size: 100%; font-size-adjust: none; text-indent: 0; text-align: left; text-transform: none; letter-spacing: normal; word-spacing: normal; word-wrap: normal; white-space: nowrap; float: none; direction: ltr; max-width: none; max-height: none; min-width: 0; min-height: 0; border: 0; padding: 0; margin: 0}
.MathJax_SVG * {transition: none; -webkit-transition: none; -moz-transition: none; -ms-transition: none; -o-transition: none}
.mjx-svg-href {fill: blue; stroke: blue}
</style><svg style="display: none;"><defs id="MathJax_SVG_glyphs"></defs></svg><pre><code>19
</code></pre></div></div></div><div class="challenge_explanation"><div class="msB challenge_explanation_title"><p><strong>Explanation</strong></p></div><div class="msB challenge_explanation_body"><div class="hackdown-content"><style id="MathJax_SVG_styles">.MathJax_SVG_Display {text-align: center; margin: 1em 0em; position: relative; display: block!important; text-indent: 0; max-width: none; max-height: none; min-width: 0; min-height: 0; width: 100%}
.MathJax_SVG .MJX-monospace {font-family: monospace}
.MathJax_SVG .MJX-sans-serif {font-family: sans-serif}
.MathJax_SVG {display: inline; font-style: normal; font-weight: normal; line-height: normal; font-size: 100%; font-size-adjust: none; text-indent: 0; text-align: left; text-transform: none; letter-spacing: normal; word-spacing: normal; word-wrap: normal; white-space: nowrap; float: none; direction: ltr; max-width: none; max-height: none; min-width: 0; min-height: 0; border: 0; padding: 0; margin: 0}
.MathJax_SVG * {transition: none; -webkit-transition: none; -moz-transition: none; -ms-transition: none; -o-transition: none}
.mjx-svg-href {fill: blue; stroke: blue}
.MathJax_SVG_LineBox {display: table!important}
.MathJax_SVG_LineBox span {display: table-cell!important; width: 10000em!important; min-width: 0; max-width: none; padding: 0; border: 0; margin: 0}
</style><svg style="display: none;"><defs id="MathJax_SVG_glyphs"></defs></svg><p><span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id="MathJax-Element-1-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink" width="3.327ex" height="1.676ex" style="vertical-align: -0.338ex;" viewBox="0 -576.1 1432.5 721.6" role="img" focusable="false"><g stroke="currentColor" fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path stroke-width="1" d="M33 157Q33 258 109 349T280 441Q331 441 370 392Q386 422 416 422Q429 422 439 414T449 394Q449 381 412 234T374 68Q374 43 381 35T402 26Q411 27 422 35Q443 55 463 131Q469 151 473 152Q475 153 483 153H487Q506 153 506 144Q506 138 501 117T481 63T449 13Q436 0 417 -8Q409 -10 393 -10Q359 -10 336 5T306 36L300 51Q299 52 296 50Q294 48 292 46Q233 -10 172 -10Q117 -10 75 30T33 157ZM351 328Q351 334 346 350T323 385T277 405Q242 405 210 374T160 293Q131 214 119 129Q119 126 119 118T118 106Q118 61 136 44T179 26Q217 26 254 59T298 110Q300 114 325 217T351 328Z"></path><g transform="translate(529,0)"><path stroke-width="1" d="M21 287Q22 290 23 295T28 317T38 348T53 381T73 411T99 433T132 442Q161 442 183 430T214 408T225 388Q227 382 228 382T236 389Q284 441 347 441H350Q398 441 422 400Q430 381 430 363Q430 333 417 315T391 292T366 288Q346 288 334 299T322 328Q322 376 378 392Q356 405 342 405Q286 405 239 331Q229 315 224 298T190 165Q156 25 151 16Q138 -11 108 -11Q95 -11 87 -5T76 7T74 17Q74 30 114 189T154 366Q154 405 128 405Q107 405 92 377T68 316T57 280Q55 278 41 278H27Q21 284 21 287Z"></path></g><g transform="translate(981,0)"><path stroke-width="1" d="M21 287Q22 290 23 295T28 317T38 348T53 381T73 411T99 433T132 442Q161 442 183 430T214 408T225 388Q227 382 228 382T236 389Q284 441 347 441H350Q398 441 422 400Q430 381 430 363Q430 333 417 315T391 292T366 288Q346 288 334 299T322 328Q322 376 378 392Q356 405 342 405Q286 405 239 331Q229 315 224 298T190 165Q156 25 151 16Q138 -11 108 -11Q95 -11 87 -5T76 7T74 17Q74 30 114 189T154 366Q154 405 128 405Q107 405 92 377T68 316T57 280Q55 278 41 278H27Q21 284 21 287Z"></path></g></g></svg></span> contains the following hourglasses:</p>

<p><img src="./ArraySolution_files/1534256743-35b846ad4a-hourglasssum.png" alt="image" title="">  </p>

<p>The hourglass with the maximum sum (<span style="font-size: 100%; display: inline-block;" class="MathJax_SVG" id="MathJax-Element-2-Frame"><svg xmlns:xlink="http://www.w3.org/1999/xlink" width="2.325ex" height="2.176ex" style="vertical-align: -0.338ex;" viewBox="0 -791.3 1001 936.9" role="img" focusable="false"><g stroke="currentColor" fill="currentColor" stroke-width="0" transform="matrix(1 0 0 -1 0 0)"><path stroke-width="1" d="M213 578L200 573Q186 568 160 563T102 556H83V602H102Q149 604 189 617T245 641T273 663Q275 666 285 666Q294 666 302 660V361L303 61Q310 54 315 52T339 48T401 46H427V0H416Q395 3 257 3Q121 3 100 0H88V46H114Q136 46 152 46T177 47T193 50T201 52T207 57T213 61V578Z"></path><path stroke-width="1" d="M352 287Q304 211 232 211Q154 211 104 270T44 396Q42 412 42 436V444Q42 537 111 606Q171 666 243 666Q245 666 249 666T257 665H261Q273 665 286 663T323 651T370 619T413 560Q456 472 456 334Q456 194 396 97Q361 41 312 10T208 -22Q147 -22 108 7T68 93T121 149Q143 149 158 135T173 96Q173 78 164 65T148 49T135 44L131 43Q131 41 138 37T164 27T206 22H212Q272 22 313 86Q352 142 352 280V287ZM244 248Q292 248 321 297T351 430Q351 508 343 542Q341 552 337 562T323 588T293 615T246 625Q208 625 181 598Q160 576 154 546T147 441Q147 358 152 329T172 282Q197 248 244 248Z" transform="translate(500,0)"></path></g></svg></span>) is:</p>

<pre><code>2 4 4
  2
1 2 4
</code></pre></div></div></div></div></div></div></div></div></section><section class="code-editor-section split"><div><div></div><div class="hr-monaco-editor-wrapper"><div class="hr-monaco-editor-with-input"><div><div class="hr-monaco-editor-with-statusbar"><div class="hr-monaco-editor"><div class="editor-toolbar"><div class="toolbar-left"></div><div class="toolbar-right"><div class="Select  select-language has-value is-searchable Select--single"><div class="Select-control"><span class="Select-multi-value-wrapper" id="react-select-2--value"><div class="Select-value"><span class="Select-value-label" role="option" aria-selected="true" id="react-select-2--value-item">Java 8</span></div><div class="Select-input" style="display: inline-block;"><input aria-activedescendant="react-select-2--value" aria-expanded="false" aria-haspopup="false" aria-owns="" role="combobox" value="" style="box-sizing: content-box; width: 5px;"><div style="position: absolute; top: 0px; left: 0px; visibility: hidden; height: 0px; overflow: scroll; white-space: pre; font-size: 16px; font-family: OpenSans, Arial, Helvetica, sans-serif; font-weight: 400; font-style: normal; letter-spacing: normal; text-transform: none;"></div></div></span><span class="Select-arrow-zone"><span class="Select-arrow"></span></span></div></div><div class="toolbar-custom-items"><div class="hr-monaco-reset-code"><button class="ui-btn ui-btn-normal cursor reset-btn" tabindex="0" title="Reset Code" type="button"><div class="ui-content align-icon-right"><span class="ui-text"><i class="ui-icon-reset-code icon-grey reset-icon"></i></span></div></button></div><div class="fullscreen-icon"><a class="fullscreen no-select active-link hr-monaco-base-btn" title="Switch to vertical layout" data-original-title="Switch to vertical layout"><i class="ui-icon-maximize icon-grey no-select"></i></a></div></div><div class="hr-monaco-settings-editor"><button class="ui-btn ui-btn-link cursor settings-toggle" tabindex="0" aria-haspopup="true" aria-expanded="false" aria-label="Editor Settings" title="Editor Settings"><i class="icon-cog ui-icon-settings icon-grey"></i></button></div></div></div><div class="hr-monaco-editor-parent"><div class="hr-monaco-base-editor showUnused" style="height: 526px;" data-keybinding-context="1" data-mode-id="java"><div class="monaco-editor vs" data-uri="file:///lsp-9de2cc70-3bd5-11e9-8bb0-c76a2c65e446/Solution.java" style="width: 890px; height: 526px;"><div data-mprt="3" class="overflow-guard" style="width: 890px; height: 526px;"><div class="margin" role="presentation" aria-hidden="true" style="position: absolute; will-change: transform; top: 0px; height: 1040px; width: 67px;"><div class="glyph-margin" style="left: 0px; width: 0px; height: 1040px;"></div><div class="margin-view-zones" role="presentation" aria-hidden="true" style="position: absolute;"></div><div class="margin-view-overlays" role="presentation" aria-hidden="true" style="position: absolute; width: 67px; font-family: monospace; font-weight: normal; font-size: 15px; line-height: 20px; letter-spacing: 0px; height: 1040px;"><div style="position:absolute;top:460px;width:100%;height:20px;"><div class="line-numbers" style="left:0px;width:41px;">23</div></div><div style="position:absolute;top:480px;width:100%;height:20px;"><div class="line-numbers" style="left:0px;width:41px;">24</div></div><div style="position:absolute;top:500px;width:100%;height:20px;"><div class="cldr folding alwaysShowFoldIcons" style="left:41px;width:26px;"></div><div class="line-numbers" style="left:0px;width:41px;">25</div></div><div style="position:absolute;top:520px;width:100%;height:20px;"><div class="line-numbers" style="left:0px;width:41px;">26</div></div><div style="position:absolute;top:440px;width:100%;height:20px;"><div class="line-numbers" style="left:0px;width:41px;">22</div></div><div style="position:absolute;top:420px;width:100%;height:20px;"><div class="line-numbers" style="left:0px;width:41px;">21</div></div><div style="position:absolute;top:400px;width:100%;height:20px;"><div class="line-numbers" style="left:0px;width:41px;">20</div></div><div style="position:absolute;top:260px;width:100%;height:20px;"><div class="cldr folding alwaysShowFoldIcons" style="left:41px;width:26px;"></div><div class="line-numbers" style="left:0px;width:41px;">14</div></div><div style="position:absolute;top:220px;width:100%;height:20px;"><div class="cldr folding alwaysShowFoldIcons" style="left:41px;width:26px;"></div><div class="line-numbers" style="left:0px;width:41px;">12</div></div><div style="position:absolute;top:200px;width:100%;height:20px;"><div class="line-numbers" style="left:0px;width:41px;">11</div></div><div style="position:absolute;top:180px;width:100%;height:20px;"><div class="line-numbers" style="left:0px;width:41px;">10</div></div><div style="position:absolute;top:160px;width:100%;height:20px;"><div class="cldr folding alwaysShowFoldIcons" style="left:41px;width:26px;"></div><div class="line-numbers" style="left:0px;width:41px;">9</div></div><div style="position:absolute;top:140px;width:100%;height:20px;"><div class="line-numbers" style="left:0px;width:41px;">8</div></div><div style="position:absolute;top:120px;width:100%;height:20px;"><div class="line-numbers" style="left:0px;width:41px;">7</div></div><div style="position:absolute;top:100px;width:100%;height:20px;"><div class="line-numbers" style="left:0px;width:41px;">6</div></div><div style="position:absolute;top:80px;width:100%;height:20px;"><div class="line-numbers" style="left:0px;width:41px;">5</div></div><div style="position:absolute;top:60px;width:100%;height:20px;"><div class="line-numbers" style="left:0px;width:41px;">4</div></div><div style="position:absolute;top:40px;width:100%;height:20px;"><div class="line-numbers" style="left:0px;width:41px;">3</div></div><div style="position:absolute;top:20px;width:100%;height:20px;"><div class="line-numbers" style="left:0px;width:41px;">2</div></div><div style="position:absolute;top:0px;width:100%;height:20px;"><div class="line-numbers" style="left:0px;width:41px;">1</div></div><div style="position:absolute;top:280px;width:100%;height:20px;"><div class="cldr folding alwaysShowFoldIcons" style="left:41px;width:26px;"></div><div class="line-numbers" style="left:0px;width:41px;">15</div></div><div style="position:absolute;top:380px;width:100%;height:20px;"><div class="line-numbers" style="left:0px;width:41px;">19</div></div><div style="position:absolute;top:300px;width:100%;height:20px;"><div class="line-numbers" style="left:0px;width:41px;">16</div></div><div style="position:absolute;top:360px;width:100%;height:20px;"><div class="line-numbers" style="left:0px;width:41px;">18</div></div><div style="position: absolute; top: 320px; width: 100%; height: 20px;"></div><div style="position:absolute;top:340px;width:100%;height:20px;"><div class="line-numbers" style="left:0px;width:41px;">17</div></div><div style="position:absolute;top:240px;width:100%;height:20px;"><div class="current-line" style="width:67px; height:20px;"></div><div class="line-numbers" style="left:0px;width:41px;">13</div></div></div></div><div class="monaco-scrollable-element editor-scrollable vs" role="presentation" data-mprt="5" style="position: absolute; overflow: hidden; left: 67px; width: 823px; height: 526px;"><div class="lines-content monaco-editor-background" style="position: absolute; overflow: hidden; width: 1e+06px; height: 1e+06px; will-change: transform; top: 0px; left: 0px;"><div class="view-overlays" role="presentation" aria-hidden="true" style="position: absolute; height: 0px; width: 823px;"><div style="position:absolute;top:460px;width:100%;height:20px;"><div class="cigr" style="left:0px;height:20px;width:32.984375px"></div></div><div style="position:absolute;top:480px;width:100%;height:20px;"><div class="cigr" style="left:0px;height:20px;width:32.984375px"></div></div><div style="position:absolute;top:500px;width:100%;height:20px;"><div class="cigr" style="left:0px;height:20px;width:32.984375px"></div></div><div style="position:absolute;top:520px;width:100%;height:20px;"><div class="cigr" style="left:0px;height:20px;width:32.984375px"></div><div class="cigr" style="left:32.984375px;height:20px;width:32.984375px"></div></div><div style="position:absolute;top:440px;width:100%;height:20px;"><div class="cigr" style="left:0px;height:20px;width:32.984375px"></div></div><div style="position:absolute;top:420px;width:100%;height:20px;"><div class="cigr" style="left:0px;height:20px;width:32.984375px"></div></div><div style="position:absolute;top:400px;width:100%;height:20px;"><div class="cigr" style="left:0px;height:20px;width:32.984375px"></div><div class="cigra" style="left:32.984375px;height:20px;width:32.984375px"></div></div><div style="position:absolute;top:260px;width:100%;height:20px;"><div class="cigr" style="left:0px;height:20px;width:32.984375px"></div><div class="cigra" style="left:32.984375px;height:20px;width:32.984375px"></div></div><div style="position:absolute;top:220px;width:100%;height:20px;"><div class="cigr" style="left:0px;height:20px;width:32.984375px"></div></div><div style="position:absolute;top:200px;width:100%;height:20px;"><div class="cigr" style="left:0px;height:20px;width:32.984375px"></div></div><div style="position:absolute;top:180px;width:100%;height:20px;"><div class="cigr" style="left:0px;height:20px;width:32.984375px"></div></div><div style="position:absolute;top:160px;width:100%;height:20px;"></div><div style="position:absolute;top:140px;width:100%;height:20px;"></div><div style="position:absolute;top:120px;width:100%;height:20px;"></div><div style="position:absolute;top:100px;width:100%;height:20px;"></div><div style="position:absolute;top:80px;width:100%;height:20px;"></div><div style="position:absolute;top:60px;width:100%;height:20px;"></div><div style="position:absolute;top:40px;width:100%;height:20px;"></div><div style="position:absolute;top:20px;width:100%;height:20px;"></div><div style="position:absolute;top:0px;width:100%;height:20px;"></div><div style="position:absolute;top:280px;width:100%;height:20px;"><div class="cigr" style="left:0px;height:20px;width:32.984375px"></div><div class="cigra" style="left:32.984375px;height:20px;width:32.984375px"></div><div class="cigr" style="left:65.96875px;height:20px;width:32.984375px"></div></div><div style="position:absolute;top:380px;width:100%;height:20px;"><div class="cigr" style="left:0px;height:20px;width:32.984375px"></div><div class="cigra" style="left:32.984375px;height:20px;width:32.984375px"></div></div><div style="position:absolute;top:300px;width:100%;height:20px;"><div class="cigr" style="left:0px;height:20px;width:32.984375px"></div><div class="cigra" style="left:32.984375px;height:20px;width:32.984375px"></div><div class="cigr" style="left:65.96875px;height:20px;width:32.984375px"></div><div class="cigr" style="left:98.953125px;height:20px;width:32.984375px"></div></div><div style="position:absolute;top:360px;width:100%;height:20px;"><div class="cigr" style="left:0px;height:20px;width:32.984375px"></div><div class="cigra" style="left:32.984375px;height:20px;width:32.984375px"></div><div class="cigr" style="left:65.96875px;height:20px;width:32.984375px"></div></div><div style="position: absolute; top: 320px; width: 100%; height: 20px;"></div><div style="position:absolute;top:340px;width:100%;height:20px;"><div class="cigr" style="left:0px;height:20px;width:32.984375px"></div><div class="cigra" style="left:32.984375px;height:20px;width:32.984375px"></div><div class="cigr" style="left:65.96875px;height:20px;width:32.984375px"></div><div class="cigr" style="left:98.953125px;height:20px;width:32.984375px"></div></div><div style="position:absolute;top:240px;width:100%;height:20px;"><div class="current-line" style="width:823px; height:20px;"></div><div class="cigr" style="left:0px;height:20px;width:32.984375px"></div><div class="cigra" style="left:32.984375px;height:20px;width:32.984375px"></div></div></div><div role="presentation" aria-hidden="true" class="view-rulers"></div><div class="view-zones" role="presentation" aria-hidden="true" style="position: absolute;"></div><div class="view-lines" role="presentation" aria-hidden="true" data-mprt="7" style="position: absolute; font-family: monospace; font-weight: normal; font-size: 15px; line-height: 20px; letter-spacing: 0px; width: 823px; height: 1040px;"><div style="top: 460px; height: 20px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="mtk6">private</span><span class="mtk1">&nbsp;</span><span class="mtk6">static</span><span class="mtk1">&nbsp;</span><span class="mtk6">final</span><span class="mtk1">&nbsp;Scanner&nbsp;scanner&nbsp;=&nbsp;</span><span class="mtk6">new</span><span class="mtk1">&nbsp;Scanner(System.in);</span></span></div><div style="top: 480px; height: 20px;" class="view-line"><span><span>&nbsp;</span></span></div><div style="top: 500px; height: 20px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="mtk6">public</span><span class="mtk1">&nbsp;</span><span class="mtk6">static</span><span class="mtk1">&nbsp;</span><span class="mtk6">void</span><span class="mtk1">&nbsp;main(String[]&nbsp;args)&nbsp;</span><span class="mtk6">throws</span><span class="mtk1">&nbsp;IOException&nbsp;{</span></span></div><div style="top: 520px; height: 20px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;BufferedWriter&nbsp;bufferedWriter&nbsp;=&nbsp;</span><span class="mtk6">new</span><span class="mtk1">&nbsp;BufferedWriter(</span><span class="mtk6">new</span><span class="mtk1">&nbsp;FileWriter(System.getenv</span></span></div><div style="top: 440px; height: 20px;" class="view-line"><span><span>&nbsp;</span></span></div><div style="top: 420px; height: 20px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;}</span></span></div><div style="top: 400px; height: 20px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="mtk6">return</span><span class="mtk1">&nbsp;b;</span></span></div><div style="top: 260px; height: 20px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="mtk6">for</span><span class="mtk1">(</span><span class="mtk6">int</span><span class="mtk1">&nbsp;i&nbsp;=&nbsp;</span><span class="mtk7">0</span><span class="mtk1">;&nbsp;i&nbsp;&lt;&nbsp;</span><span class="mtk7">4</span><span class="mtk1">;&nbsp;i++){</span></span></div><div style="top:220px;height:20px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="mtk6">static</span><span class="mtk1">&nbsp;</span><span class="mtk6">int</span><span class="mtk1">&nbsp;hourglassSum(</span><span class="mtk6">int</span><span class="mtk1">[][]&nbsp;arr)&nbsp;{</span></span></div><div style="top:200px;height:20px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="mtk8">//&nbsp;Complete&nbsp;the&nbsp;hourglassSum&nbsp;function&nbsp;below.</span></span></div><div style="top:180px;height:20px;" class="view-line"><span><span>&nbsp;</span></span></div><div style="top:160px;height:20px;" class="view-line"><span><span class="mtk6">public</span><span class="mtk1">&nbsp;</span><span class="mtk6">class</span><span class="mtk1">&nbsp;Solution&nbsp;{</span></span></div><div style="top:140px;height:20px;" class="view-line"><span><span>&nbsp;</span></span></div><div style="top:120px;height:20px;" class="view-line"><span><span class="mtk6">import</span><span class="mtk1">&nbsp;java.util.regex.*;</span></span></div><div style="top:100px;height:20px;" class="view-line"><span><span class="mtk6">import</span><span class="mtk1">&nbsp;java.util.concurrent.*;</span></span></div><div style="top:80px;height:20px;" class="view-line"><span><span class="mtk6">import</span><span class="mtk1">&nbsp;java.util.*;</span></span></div><div style="top:60px;height:20px;" class="view-line"><span><span class="mtk6">import</span><span class="mtk1">&nbsp;java.text.*;</span></span></div><div style="top:40px;height:20px;" class="view-line"><span><span class="mtk6">import</span><span class="mtk1">&nbsp;java.security.*;</span></span></div><div style="top:20px;height:20px;" class="view-line"><span><span class="mtk6">import</span><span class="mtk1">&nbsp;java.math.*;</span></span></div><div style="top:0px;height:20px;" class="view-line"><span><span class="mtk6">import</span><span class="mtk1">&nbsp;java.io.*;</span></span></div><div style="top: 280px; height: 20px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="mtk6">for</span><span class="mtk1">(</span><span class="mtk6">int</span><span class="mtk1">&nbsp;j&nbsp;=&nbsp;</span><span class="mtk7">1</span><span class="mtk1">;&nbsp;j&nbsp;&lt;&nbsp;</span><span class="mtk7">5</span><span class="mtk1">;&nbsp;j++){</span></span></div><div style="top: 380px; height: 20px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</span></span></div><div style="top: 300px; height: 20px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="mtk6">int</span><span class="mtk1">&nbsp;a&nbsp;=&nbsp;(arr[i][j-</span><span class="mtk7">1</span><span class="mtk1">]&nbsp;+&nbsp;arr[i][j]&nbsp;+&nbsp;arr[i][j+</span><span class="mtk7">1</span><span class="mtk1">]&nbsp;+&nbsp;arr[i+</span><span class="mtk7">1</span><span class="mtk1">][j]&nbsp;+&nbsp;arr[i+</span><span class="mtk7">2</span><span class="mtk1">][j-</span><span class="mtk7">1</span><span class="mtk1">]&nbsp;+&nbsp;</span></span></div><div style="top: 360px; height: 20px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;}</span></span></div><div style="top: 320px; height: 20px;" class="view-line"><span><span class="mtk1">arr[i+</span><span class="mtk7">2</span><span class="mtk1">][j]&nbsp;+&nbsp;arr[i+</span><span class="mtk7">2</span><span class="mtk1">][j+</span><span class="mtk7">1</span><span class="mtk1">]);</span></span></div><div style="top: 340px; height: 20px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;b&nbsp;=&nbsp;Math.max(a,b);</span></span></div><div style="top:240px;height:20px;" class="view-line"><span><span class="mtk1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span><span class="mtk6">int</span><span class="mtk1">&nbsp;b&nbsp;=&nbsp;</span><span class="mtk7">0</span><span class="mtk1">;</span></span></div></div><div data-mprt="1" class="contentWidgets" style="position: absolute; top: 0px;"><div class="lightbulb-glyph" title="Show Fixes (Ctrl+.)" widgetid="LightBulbWidget" style="position: absolute; visibility: hidden; max-width: 823px;"></div></div><div role="presentation" aria-hidden="true" class="cursors-layer cursor-line-style cursor-solid"><div class="cursor " style="height: 20px; top: 240px; left: 0px; font-family: monospace; font-weight: normal; font-size: 15px; line-height: 20px; letter-spacing: 0px; display: block; visibility: hidden; width: 1.6px;"></div></div></div><div role="presentation" aria-hidden="true" class="invisible scrollbar horizontal" style="position: absolute; width: 809px; height: 10px; left: 0px; bottom: 0px;"><div class="slider" style="position: absolute; top: 0px; left: 0px; height: 10px; will-change: transform; width: 809px;"></div></div><canvas class="decorationsOverviewRuler" aria-hidden="true" width="17" height="657" style="position: absolute; will-change: transform; top: 0px; right: 0px; width: 14px; height: 526px;"></canvas><div role="presentation" aria-hidden="true" class="visible scrollbar vertical" style="position: absolute; width: 14px; height: 526px; right: 0px; top: 0px;"><div class="slider" style="position: absolute; top: 0px; left: 0px; width: 14px; will-change: transform; height: 266px;"></div></div></div><div role="presentation" aria-hidden="true" style="width: 890px;" class=""></div><textarea data-mprt="6" class="inputarea" wrap="off" autocorrect="off" autocapitalize="off" autocomplete="off" spellcheck="false" aria-label="Editor content;Press Alt+F1 for Accessibility Options." role="textbox" aria-multiline="true" aria-haspopup="false" aria-autocomplete="both" style="font-size: 1px; line-height: 20px; top: 240px; left: 67px; width: 1px; height: 1px;"></textarea><div style="position: absolute; top: 0px; left: 0px; width: 0px; height: 0px;"></div><div data-mprt="4" class="overlayWidgets" style="width: 890px;"><div class="accessibilityHelpWidget" role="dialog" aria-hidden="true" widgetid="editor.contrib.accessibilityHelpWidget" style="display: none; position: absolute;"><div role="document"></div></div><div class="monaco-editor-hover hidden" aria-hidden="true" role="presentation" widgetid="editor.contrib.modesGlyphHoverWidget" style="position: absolute;"></div></div><div data-mprt="8" class="minimap slider-mouseover" role="presentation" aria-hidden="true" style="position: absolute; left: 0px; width: 0px; height: 526px;"><div class="minimap-shadow-hidden" style="height: 526px;"></div><canvas width="1" height="657" style="position: absolute; left: 0px; width: 0.8px; height: 525.6px;"></canvas><div class="minimap-slider" style="position: absolute; will-change: transform; width: 0px;"><div class="minimap-slider-horizontal" style="position: absolute; width: 0px; height: 0px;"></div></div></div></div><div data-mprt="2" class="overflowingContentWidgets"><div class="monaco-editor rename-box" widgetid="__renameInputWidget" style="height: 20px; box-shadow: rgb(168, 168, 168) 0px 2px 8px; position: absolute; visibility: hidden; max-width: 1536px;"><input class="rename-input" type="text" aria-label="Rename input. Type new name and press Enter to commit." style="font-family: monospace; font-weight: normal; font-size: 15px; background-color: rgb(255, 255, 255); color: rgb(97, 97, 97); border-width: 0px; border-style: none;"></div><div class="monaco-editor-hover hidden" tabindex="0" widgetid="editor.contrib.modesContentHoverWidget" style="position: absolute; visibility: hidden; max-width: 1536px;"><div class="monaco-scrollable-element " role="presentation" style="position: relative; overflow: hidden;"><div class="monaco-editor-hover-content" style="overflow: hidden; font-size: 15px; line-height: 20px; max-height: 250px;"></div><div role="presentation" aria-hidden="true" class="invisible scrollbar horizontal" style="position: absolute;"><div class="slider" style="position: absolute; top: 0px; left: 0px; height: 10px; will-change: transform;"></div></div><div role="presentation" aria-hidden="true" class="invisible scrollbar vertical" style="position: absolute;"><div class="slider" style="position: absolute; top: 0px; left: 0px; width: 10px; will-change: transform;"></div></div><div class="shadow"></div><div class="shadow"></div><div class="shadow top-left-corner"></div></div></div><div class="editor-widget suggest-widget" widgetid="editor.widget.suggestWidget" style="position: absolute; visibility: inherit; max-width: 1536px; line-height: 20px; top: 420px; left: 207px;" monaco-visible-content-widget="true"><div class="message" aria-hidden="true" style="display: none; background-color: rgb(239, 239, 242); border-color: rgb(200, 200, 200);"></div><div class="tree" style="background-color: rgb(239, 239, 242); border-color: rgb(200, 200, 200); height: 60px; display: none;" aria-hidden="true"><div class="monaco-list list_id_1 selection-none" role="tree" tabindex="0"><div class="monaco-scrollable-element " role="presentation" style="position: relative; overflow: hidden;"><div class="monaco-list-rows" style="overflow: hidden; height: 0px; top: 0px;"></div><div role="presentation" aria-hidden="true" class="invisible scrollbar horizontal" style="position: absolute; width: 0px; height: 0px; left: 0px; bottom: 0px;"><div class="slider" style="position: absolute; top: 0px; left: 0px; height: 10px; will-change: transform; width: 0px;"></div></div><div role="presentation" aria-hidden="true" class="invisible scrollbar vertical" style="position: absolute; width: 10px; height: 60px; right: 0px; top: 0px;"><div class="slider" style="position: absolute; top: 0px; left: 0px; width: 10px; will-change: transform; height: 60px;"></div></div></div><style type="text/css" media="screen">.monaco-list.list_id_1:focus .monaco-list-row.focused { background-color: #dff0ff; }
.monaco-list.list_id_1:focus .monaco-list-row.focused:hover { background-color: #dff0ff; }
.monaco-list.list_id_1:focus .monaco-list-row.selected { background-color: #2477ce; }
.monaco-list.list_id_1:focus .monaco-list-row.selected:hover { background-color: #2477ce; }
.monaco-list.list_id_1:focus .monaco-list-row.selected { color: #ffffff; }
.monaco-list.list_id_1:focus .monaco-list-row.selected.focused { background-color: #2477ce; }
.monaco-list.list_id_1:focus .monaco-list-row.selected.focused { color: #ffffff; }
.monaco-list.list_id_1 .monaco-list-row.focused { background-color:  #dff0ff; }
.monaco-list.list_id_1 .monaco-list-row.focused:hover { background-color:  #dff0ff; }
.monaco-list.list_id_1 .monaco-list-row.selected { background-color:  #dddfea; }
.monaco-list.list_id_1 .monaco-list-row.selected:hover { background-color:  #dddfea; }
.monaco-list.list_id_1 .monaco-list-row:hover { background-color:  #f0f0f0; }</style></div></div><div class="details" aria-hidden="true" style="font-size: 15px; display: none; background-color: rgb(239, 239, 242); border-color: rgb(200, 200, 200);"><div class="monaco-scrollable-element " role="presentation" style="position: relative; overflow: hidden;"><div class="body" style="overflow: hidden;"><div class="header"><span class="close" title="Read less... (Ctrl+Space)" style="height: 20px; width: 20px;"></span><p class="type" style="font-family: monospace;"></p></div><p class="docs"></p></div><div role="presentation" aria-hidden="true" class="invisible scrollbar horizontal" style="position: absolute;"><div class="slider" style="position: absolute; top: 0px; left: 0px; height: 10px; will-change: transform;"></div></div><div role="presentation" aria-hidden="true" class="invisible scrollbar vertical" style="position: absolute;"><div class="slider" style="position: absolute; top: 0px; left: 0px; width: 10px; will-change: transform;"></div></div><div class="shadow"></div><div class="shadow"></div><div class="shadow top-left-corner"></div></div></div></div></div><div class="context-view monaco-builder-hidden" aria-hidden="true"></div></div></div></div></div><div class="hr-monaco-editor-statusbar"><div class="statusbar-position">Line: 13 Col: 1</div><div style="display: flex;"><div class="statusbar-message"></div></div></div></div><div class="pmR pmL pmB plT run-code-wrapper"><button class=" pull-right btn btn-primary hr-monaco-submit">Submit Code</button><button class=" pull-right btn msR hr-monaco-compile">Run Code</button></div></div><div class="pmR pmL pmB hr-monaco-custom-input-wrapper inline"><div><button class="btn btn-text upload-file mlR" data-analytics="Upload File" type="button"><i class="icon-upload ui-icon-upload"></i>Upload Code as File</button></div><div><label><div class="custom-checkbox inline"><input type="checkbox" class="custom-input-checkbox"></div><span class="lmT msL testcase-label">Test against custom input</span></label></div></div></div></div></div><div class="challenge-response fs-container"><div class="output-area-wrap"><div class="output-area mlT psT" id="output-area"><div class="submission-status theme-m-content"><div class="challenge-submission-wrapper"><div class="submission-error-wrapper"><p class="status compile-error">2/9 test cases failed :(</p><div class="compile-advice"><div class="submission-ask-help">Ask your friends for help:<div class="social-links-wrapper inline-block msL text-center"><a class="cursor"><i class="social-share-icon ui-icon-facebook"></i></a><a class="cursor"><i class="social-share-icon ui-icon-twitter"></i></a><a class="cursor"><i class="social-share-icon ui-icon-linkedin"></i></a></div></div></div></div><div class="testcase-header"><div class="testcase-results"><div class="tc-container"><div class="testcase-wrapper theme-m"><div class="ui-tabs-wrap testcases-result-wrapper theme-m vertical-layout"><div class="render-list clearfix"><ul class="tab-header" role="tablist"><li id="Test case 3" class="tab-item active" role="tab" aria-selected="true"><div class="testcase-tab-item tab-item-color-error testcase-item" data-attr2="master" data-attr3="2d-array" data-analytics="TestCaseResultsTab" data-attr1="SubmitCode" data-attr5="3"><span class="ui-icon-label tab-item-label">Test case 3</span><i class="ui-icon-cross"></i></div></li><li id="Test case 7" class="tab-item" role="tab" aria-selected="false"><div class="testcase-tab-item tab-item-color-error testcase-item" data-attr2="master" data-attr3="2d-array" data-analytics="TestCaseResultsTab" data-attr1="SubmitCode" data-attr5="3"><span class="ui-icon-label tab-item-label">Test case 7</span><i class="ui-icon-cross"></i></div></li><li id="Test case 0" class="tab-item" role="tab" aria-selected="false"><div class="testcase-tab-item tab-item-color-success testcase-item" data-attr2="master" data-attr3="2d-array" data-analytics="TestCaseResultsTab" data-attr1="SubmitCode" data-attr5="3"><span class="ui-icon-label tab-item-label">Test case 0</span><i class="ui-icon-check-circle"></i></div></li><li id="Test case 1" class="tab-item" role="tab" aria-selected="false"><div class="testcase-tab-item tab-item-color-success testcase-item" data-attr2="master" data-attr3="2d-array" data-analytics="TestCaseResultsTab" data-attr1="SubmitCode" data-attr5="3"><span class="ui-icon-label tab-item-label">Test case 1</span><i class="ui-icon-check-circle"></i></div></li><li id="Test case 2" class="tab-item" role="tab" aria-selected="false"><div class="testcase-tab-item tab-item-color-success testcase-item" data-attr2="master" data-attr3="2d-array" data-analytics="TestCaseResultsTab" data-attr1="SubmitCode" data-attr5="3"><span class="ui-icon-label tab-item-label">Test case 2</span><i class="ui-icon-check-circle"></i></div></li><li id="Test case 4" class="tab-item" role="tab" aria-selected="false"><div class="testcase-tab-item tab-item-color-success testcase-item" data-attr2="master" data-attr3="2d-array" data-analytics="TestCaseResultsTab" data-attr1="SubmitCode" data-attr5="3"><span class="ui-icon-label tab-item-label">Test case 4</span><i class="ui-icon-check-circle"></i></div></li><li id="Test case 5" class="tab-item" role="tab" aria-selected="false"><div class="testcase-tab-item tab-item-color-success testcase-item" data-attr2="master" data-attr3="2d-array" data-analytics="TestCaseResultsTab" data-attr1="SubmitCode" data-attr5="3"><span class="ui-icon-label tab-item-label">Test case 5</span><i class="ui-icon-check-circle"></i></div></li><li id="Test case 6" class="tab-item" role="tab" aria-selected="false"><div class="testcase-tab-item tab-item-color-success testcase-item" data-attr2="master" data-attr3="2d-array" data-analytics="TestCaseResultsTab" data-attr1="SubmitCode" data-attr5="3"><span class="ui-icon-label tab-item-label">Test case 6</span><i class="ui-icon-check-circle"></i></div></li><li id="Test case 8" class="tab-item" role="tab" aria-selected="false"><div class="testcase-tab-item tab-item-color-success testcase-item" data-attr2="master" data-attr3="2d-array" data-analytics="TestCaseResultsTab" data-attr1="SubmitCode" data-attr5="3"><span class="ui-icon-label tab-item-label">Test case 8</span><i class="ui-icon-check-circle"></i></div></li></ul></div><div class="tab-list-content tab-content d-flex" role="tabpanel"><div class="tab-pane-content"><div class="flex-block compilation-time-response full-width flex-column"><div class="compiler-message run-time-message flex-display"><div class="compile-field-label">Compiler Message</div><pre class="compile-output-message"><code class="bold">Wrong Answer</code></pre></div><div class="stdin run-time-message flex-display"><div class="compile-field-label">Input (stdin)<a data-attr2="master" data-attr3="2d-array" data-analytics="DownloadTestcase" data-attr1="SubmitCode" data-attr4="stdin" data-attr7="3" data-attr6="right" class="text-link tc-download-link">Download</a></div><pre class="compile-output-message"><code class="bold">-1 -1 0 -9 -2 -2
-2 -1 -6 -8 -2 -5
-1 -1 -1 -2 -3 -4
-1 -9 -2 -4 -4 -5
-7 -3 -3 -2 -9 -9
-1 -3 -1 -2 -4 -5</code></pre></div><div class="expected-output run-time-message flex-display"><div class="compile-field-label">Expected Output<a data-attr2="master" data-attr3="2d-array" data-analytics="DownloadTestcase" data-attr1="SubmitCode" data-attr4="expected-output" data-attr7="3" data-attr6="right" class="text-link tc-download-link">Download</a></div><pre class="compile-output-message"><code class="bold">-6</code></pre></div></div></div></div></div></div></div></div></div></div></div></div></div></div></section></div><div class="right-pane"><aside class="theme-m-content fullscreen-hide challenge-sidebar"><div class="challenge-sidebar-container"><div class="sidebar-problem-difficulty challenge-sidebar-help"><div class="difficulty-block"><p class="difficulty-label">Author</p><a class="pull-right text-link" data-analytics="ChallengeViewHeaderAuthor" data-attr1="2d-array" data-attr2="Shafaet" href="https://www.hackerrank.com/profile/Shafaet">Shafaet</a></div><div class="difficulty-block"><p class="difficulty-label">Difficulty</p><p class="pull-right difficulty-easy">Easy</p></div><div class="difficulty-block"><p class="difficulty-label">Max Score</p><p class="sidebar-detail pull-right">15</p></div><div class="difficulty-block"><p class="difficulty-label">Submitted By</p><a class="pull-right text-link" data-analytics="ChallengeViewHackerCount" data-attr1="2d-array" href="https://www.hackerrank.com/challenges/2d-array/leaderboard">244715</a></div></div><div class="challenge-sidebar-help"><h2 class="text-sec-headline-s">Need Help?</h2><hr class="hr-line-light"><div class="mlB"><div class="link-wrapper"><a data-analytics="ChallengeSidebarUI" data-attr1="discussions" data-attr2="2d-array" data-attr3="master" href="https://www.hackerrank.com/challenges/2d-array/forum"><i class="ui-icon-discussion ui-icon-grey sidebar-icon"></i><span class="ui-icon-label">View discussions</span></a></div><div class="link-wrapper"><a data-analytics="ChallengeSidebarUI" data-attr1="editorial" data-attr2="2d-array" data-attr3="master" href="https://www.hackerrank.com/challenges/2d-array/editorial"><i class="ui-icon-editorial ui-icon-grey sidebar-icon"></i><span class="ui-icon-label">View editorial</span></a></div><div class="link-wrapper"><a data-analytics="ChallengeSidebarUI" data-attr1="topscorers" data-attr2="2d-array" data-attr3="master" href="https://www.hackerrank.com/challenges/2d-array/leaderboard"><i class="ui-icon-trophy ui-icon-grey sidebar-icon"></i><span class="ui-icon-label">View top submissions</span></a></div></div></div><div class="challenge-rating rating"><p class="zeta rating-label">rate this challenge</p><div class="rating"><i class="rating-icon cursor ui-icon-star" data-analytics="RatedChallenge" data-attr7="1"></i><i class="rating-icon cursor ui-icon-star" data-analytics="RatedChallenge" data-attr7="2"></i><i class="rating-icon cursor ui-icon-star" data-analytics="RatedChallenge" data-attr7="3"></i><i class="rating-icon cursor ui-icon-star" data-analytics="RatedChallenge" data-attr7="4"></i><i class="rating-icon cursor ui-icon-star" data-analytics="RatedChallenge" data-attr7="5"></i></div></div><div class="challenge-sidebar-help need-help-wrapper"><div class="text-sec-headline-s">MORE DETAILS</div><hr class="hr-line-light"><div class="link-wrapper"><a target="_blank" id="pdf-link" data-analytics="ChallengeViewSidebarPDF" data-attr1="2d-array" href="https://www.hackerrank.com/rest/contests/master/challenges/2d-array/download_pdf?language=English"><i class="ui-icon-grey sidebar-icon ui-icon-download"></i><span class="ui-icon-label">Download problem statement</span></a></div><div class="link-wrapper"><a target="_blank" id="test-cases-link" data-analytics="ChallengeViewSidebarTestCases" data-attr1="2d-array" href="https://www.hackerrank.com/rest/contests/master/challenges/2d-array/download_testcases"><i class="ui-icon-grey sidebar-icon ui-icon-download"></i><span class="ui-icon-label">Download sample test cases</span></a></div><div class="link-wrapper fullscreen-hide"><a class="cursor" data-analytics="ChallengeViewSuggestEdit" data-attr1="2d-array"><i class="ui-icon-grey sidebar-icon ui-icon-edit"></i><span class="ui-icon-label">Suggest Edits</span></a></div></div><div class="social-share-wrap-2"><div class="clearfix"><div class="social-links-wrapper pull-left"><a class="cursor"><i class="social-share-icon ui-icon-facebook"></i></a><a class="cursor"><i class="social-share-icon ui-icon-twitter"></i></a><a class="cursor"><i class="social-share-icon ui-icon-linkedin"></i></a></div></div></div></div></aside></div></div></div></div></section></div></div><footer class="community-footer"><ul class="footer-links"><li class="link-item"><a target="_blank" class="footer-link calendar" data-analytics="FooterLinkCalendar" href="https://www.hackerrank.com/calendar">Contest Calendar</a></li><li class="link-item"><a target="_blank" class="footer-link blog" data-analytics="FooterLinkBlog" href="https://blog.hackerrank.com/">Blog</a></li><li class="link-item"><a target="_blank" class="footer-link scoring" data-analytics="FooterLinkScoring" href="https://www.hackerrank.com/scoring">Scoring</a></li><li class="link-item"><a target="_blank" class="footer-link environment" data-analytics="FooterLinkEnvironment" href="https://www.hackerrank.com/environment">Environment</a></li><li class="link-item"><a target="_blank" class="footer-link faq" data-analytics="FooterLinkFAQ" href="https://www.hackerrank.com/faq">FAQ</a></li><li class="link-item"><a target="_blank" class="footer-link" data-analytics="FooterLinkAboutUs" href="https://www.hackerrank.com/aboutus">About Us</a></li><li class="link-item"><a target="_blank" class="footer-link" data-analytics="FooterLinkSupport" href="https://help.hackerrank.com/hc/en-us">Support</a></li><li class="link-item"><a target="_blank" class="footer-link" data-analytics="FooterLinkCareers" href="https://www.hackerrank.com/careers">Careers</a></li><li class="link-item"><a target="_blank" class="footer-link" data-analytics="FooterLinkTermsOfService" href="https://www.hackerrank.com/terms-of-service">Terms Of Service</a></li><li class="link-item"><a target="_blank" class="footer-link" data-analytics="FooterLinkPrivacyPolicy" href="https://www.hackerrank.com/privacy">Privacy Policy</a></li><li class="link-item"><a target="_blank" class="footer-link featureRequestButton" data-analytics="FooterLinkFeatureRequest" href="https://www.hackerrank.com/support/feature">Request a Feature</a></li></ul></footer></div></div></div></div><!--Required to handle event bubbling of click in ios safari -->

  <script>
    //HR namespace
    var HR = {};
    HR.development = false;
    HR.assetPath = 'https://hrcdn.net/fcore/assets/';
    HR.pageLoadTime = Date.now();
    HR.productNamespace = 'hackerrank';
    HR.production = true;
    HR.devServer = false;
    HR.isIsomorphic = true;
    HR.loadedWithOldCss = false;
    HR.pusher = {"key":"a280047e3b323ccb1b65","cluster":"mt1"};
  </script>

  <!-- Vendor scripts -->
  
    <script src="./ArraySolution_files/hackerrank_r_vendor-4dd797fb49.js.download"></script>
  

  
  <script src="./ArraySolution_files/runtime-035da432635eed8e43f0.js.download"></script>
  <script src="./ArraySolution_files/hackerrank_r_app-07b5f4f577599147823c.js.download"></script>
  
<script>
  var getUser = (function() {
    var userData;
    $(window).on('initializeNewUser', function(e, user) {
      userData = user;
    });
    try{
      if (typeof userData === 'undefined') {
        userData = JSON.parse(decodeURI($('#initialUserData').html()));
        $('#initialUserData').remove();
      }
    } catch(e){
      userData = {};
      console.log('No initial User data found');
    }
    return function() {
      return userData;
    }
  })();
</script>


<!-- setting up sentry -->

  <script src="./ArraySolution_files/raven.min.js.download" async="" crossorigin="anonymous" id="raven"></script>
  <script>
    (function(window, queue, loaded, script, user) {

        var setupRaven = function(user) {
          var userContext = {};
          if (user && !!user.id) {
            userContext.handle = user.id;
          }
          var extraContext = {
            cdnUrl: Cookies.get("cdn_url")
          }
          if (Cookies) {
            if (HR.productNamespace === 'hackerrank') {
              extraContext.mixpanel_token = Cookies.get('hackerrank_mixpanel_token')
            } else if (HR.productNamespace === 'hackerrankx') {
              extraContext.mixpanel_token = Cookies.get('hackerrankx_mixpanel_token')
            }
          }
          if(typeof Raven !== 'undefined') {
            Raven.setUserContext(userContext);
            Raven.setExtraContext(extraContext);
          }
        }
        $(window).on('initializeNewUser', function(e, user) {
          setupRaven(user);
        });

        window.onerror = function e(message, file, lineNo, columnNo, error) {
            if (loaded) return;
            queue.push([message, file, lineNo, columnNo, error]);
        };

        window.onunhandledrejection = function e(error) {
            if (loaded) return;
            queue.push([
                error.reason,
            ]);
        };

        script.onreadystatechange = script.onload = function() {
            if (loaded) return;
            loaded = true;

            Raven.config('https://6b2d52b23d5a4dd4bc44330335327c04@sentry.io/234162', {
                release: "d79faa5cdc",
                ignoreUrls: [/cdn\.userty\.com/],
                ignoreErrors: [
                  'Error: Connection is disposed',
                  'Connection got disposed',
                  'A network error occurred',
                  'Model is disposed!',
                ],
            }).install();

            setupRaven(user);

            window.onunhandledrejection = function e(error) {
                Raven.captureException(error.reason, {
                    extra: {
                        type: error.type,
                    },
                });
            };

            queue.forEach(function(error) {
                Raven.captureException(error[4] || error[0], {
                    extra: {
                        file: error[1],
                        line: error[2],
                        col: error[3],
                    },
                });
            });
        };
    }(window, [], false, document.getElementById('raven'), getUser()));
 </script>




<!-- google analytics tracking -->
<script>
  var _gaq = _gaq || [];
  
  _gaq.push(['candidate_company._setAccount', 'UA-45092266-1']);
  _gaq.push(['candidate_company._trackPageview']);
  _gaq.push(['candidate_company._gat._anonymizeIp']);
  _gaq.push(['_setCampSourceKey', 'utm_source']);
  _gaq.push(['_setCampMediumKey', 'utm_medium']);
  _gaq.push(['_setCampContentKey', 'utm_keyword']);
  _gaq.push(['_setCampTermKey', 'utm_keyword']);
  _gaq.push(['_setCampNameKey', 'utm_campaign']);

  (function() {
    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
  })();
  
</script>
<!-- Pending candidate site custom GA code -->
<!-- google analytics tracking end-->

<!-- mixpanel tracking -->
<script type="text/javascript">
  
    (function(e,a){if(!a.__SV){var b=window;try{var c,l,i,j=b.location,g=j.hash;c=function(a,b){return(l=a.match(RegExp(b+"=([^&]*)")))?l[1]:null};g&&c(g,"state")&&(i=JSON.parse(decodeURIComponent(c(g,"state"))),"mpeditor"===i.action&&(b.sessionStorage.setItem("_mpcehash",g),history.replaceState(i.desiredHash||"",e.title,j.pathname+j.search)))}catch(m){}var k,h;window.mixpanel=a;a._i=[];a.init=function(b,c,f){function e(b,a){var c=a.split(".");2==c.length&&(b=b[c[0]],a=c[1]);b[a]=function(){b.push([a].concat(Array.prototype.slice.call(arguments,
0)))}}var d=a;"undefined"!==typeof f?d=a[f]=[]:f="mixpanel";d.people=d.people||[];d.toString=function(b){var a="mixpanel";"mixpanel"!==f&&(a+="."+f);b||(a+=" (stub)");return a};d.people.toString=function(){return d.toString(1)+".people (stub)"};k="disable time_event track track_pageview track_links track_forms register register_once alias unregister identify name_tag set_config reset people.set people.set_once people.increment people.append people.union people.track_charge people.clear_charges people.delete_user".split(" ");
for(h=0;h<k.length;h++)e(d,k[h]);a._i.push([b,c,f])};a.__SV=1.2;b=e.createElement("script");b.type="text/javascript";b.async=!0;b.src="undefined"!==typeof MIXPANEL_CUSTOM_LIB_URL?MIXPANEL_CUSTOM_LIB_URL:"file:"===e.location.protocol&&"//cdn.mxpnl.com/libs/mixpanel-2-latest.min.js".match(/^\/\//)?"https://cdn.mxpnl.com/libs/mixpanel-2-latest.min.js":"//cdn.mxpnl.com/libs/mixpanel-2-latest.min.js";c=e.getElementsByTagName("script")[0];c.parentNode.insertBefore(b,c)}})(document,window.mixpanel||[]);
    mixpanel.init("bcb75af88bccc92724ac5fd79271e1ff");

    
      
        mixpanel.init("86cf4681911d3ff600208fdc823c5ff5", {}, "jobs_test");
      
      mixpanel.identify(Cookies.get("hackerrank_mixpanel_token"));
    
  
</script>
<!-- mixpanel tracking end-->

<!-- auryc tracking start -->
<script type="text/javascript">
  
    function aurycProps(user) {
      if(HR.productNamespace === 'hackerrankx') {
        userProps = {
          user_role: user.role,
          company_id: user.company.id,
          plan_name: user.company.plan_name
        }
      } else if (HR.productNamespace === 'hackerrank') {
        userProps = {
          user_id: user.id,
        };
      } else {
        userProps = {};
      }
      return userProps;
    }

    function setupAurycProps(aurycId, user) {
      userProps = aurycProps(user);
      window.auryc.identify(aurycId);
      window.auryc.addUserProperties(userProps);
      window.auryc.setFeedbackEnabled(!!user.enable_nps_survey);
      window.auryc.addSessionProperties({productNamespace: HR.productNamespace});
    }

    setupAuryc = function(user) {
      hackerrankxAurycSrc = "//cdn.userty.com/207-hackerrankcom/container.js";
      hackerrankAurycSrc = "//cdn.userty.com/531-hackerrankCommunity/container.js";
      if(HR.productNamespace === 'hackerrankx') {
        if (!(user && user.id) || !!Cookies.get('admin_su') || user.disable_auryc) return;
        src = hackerrankxAurycSrc;
        aurycId = user.id.toString();
      } else {
        return
      }

      ;(function (g) { g.aurycReadyCb = g.aurycReadyCb || []; var d = document, i, am = d.createElement("script"), h = d.head || d.getElementsByTagName("head")[0],aex = { "src": src, "data-cfasync": "false", "async": "true", "defer": "true", "data-vendor": "userty", "data-role": "container", "charset": "utf-8" }; for (var attr in aex) { am.setAttribute(attr,aex[attr]); } h.appendChild(am); })(window);

      if (window.auryc) {
        setupAurycProps(aurycId, user)
      } else if (window.aurycReadyCb) {
        window.aurycReadyCb.push(function() {
          setupAurycProps(aurycId, user)
        })
      }
    }

    setupAuryc(getUser());
    $(window).on('initializeNewUser', function(e, user) {
      setupAuryc(user);
    });
  
</script>
<!-- auryc tracking end -->

<!-- GTM tracking -->

<script type="text/javascript">
  var gtmTracking = function (user){
    if (window.dataLayer) {
      

      
        window.dataLayer.push({'event': 'setUserProps', 'userProps': {
          level: user.level,
          badges_onboarding_status: user.badges_onboarding_status,
          sourcing_jobs_consent: user.sourcing_jobs_consent
        }});
      
    }
  }
  gtmTracking(getUser());
  $(window).on('initializeNewUser', function(e, user) {
    gtmTracking(user);
  });

</script>

<!-- GTM tracking end -->


<!-- Google Tag Manager (noscript) #1 -->
<noscript><iframe src="https://www.googletagmanager.com/ns.html?id=GTM-5FXW96J"
height="0" width="0" style="display:none;visibility:hidden"></iframe></noscript>
<!-- End Google Tag Manager (noscript) #1 -->


<!-- Marketo to be added later -->



<!-- Bizible -->

<!-- HR metrics init -->
<script type="text/javascript">

  (function() {
    hr_metrics.init({
      product: 'hackerrank',
      use_cookie: true,
      uid_cookie_key: 'hackerrank_mixpanel_token',
      uid_token_cookie_key: 'metrics_user_identifier',
      session_cookie_key: 'session_id',
      metrics_endpoint:  'https://metrics.hackerrank.com/metrics' 
    });
  })();

  (function(h) {
    window.hr_metrics = h;
    if (!h.loaded) {
      var a = ['track', 'batch_track', 'app_track', 'externalService', 'init', 'batch_track_record', 'track_dwell_time', 'set_navigation_data'];
      for (var i = 0; i < a.length; i++) {
        if (!h[a[i]]) {h[a[i]] = function() {};}
      }
    }
  })(window.hr_metrics || {});



</script>

<!-- hrutm_params -->

<!-- HR metrics extension pack -->
<script type="text/javascript">

  
    if (('performance' in window) && ('timing' in window.performance)) {
      $(window).on("load", function() {
        setTimeout(function(){
          var timing = window.performance.timing;
          var obj = {
            referring_url: window.location.pathname,
            fullLoadTime: timing.loadEventEnd - timing.navigationStart,
            // Total time from req start to load
            loadTime: timing.loadEventEnd - timing.fetchStart,
            // Time spent constructing the DOM tree
            domReadyTime: timing.domComplete - timing.domInteractive,
            // Time consumed preparing the new page
            readyStart: timing.fetchStart - timing.navigationStart,
            // Time spent during redirection
            redirectTime: timing.redirectEnd - timing.redirectStart,
            // AppCache
            appcacheTime: timing.domainLookupStart - timing.fetchStart,
            // Time spent unloading documents
            unloadEventTime: timing.unloadEventEnd - timing.unloadEventStart,
            // DNS query time
            lookupDomainTime: timing.domainLookupEnd - timing.domainLookupStart,
            // TCP connection time
            connectTime: timing.connectEnd - timing.connectStart,
            // Time spent during the request
            requestTime: timing.responseEnd - timing.requestStart,
            // Request to completion of the DOM loading
            initDomTreeTime: timing.domInteractive - timing.responseEnd,
            // Load event time
            loadEventTime: timing.loadEventEnd - timing.loadEventStart,
            // Origin of the request
            react: true,
            //isIsomorphic flag
            isIsomorphic: window.HR.isIsomorphic,
            //old css loaded flag
            loadedWithOldCss: window.HR.loadedWithOldCss,
          }

          if (('navigation' in window.performance) && ('getEntries' in window.performance)) {
            obj.navigationType = window.performance.navigation.type;
            obj.navigationRedirectCount = window.performance.navigation.redirectCount;
            if (obj.fullLoadTime > 8000) {
              try {
                var entries = window.performance.getEntries();
                if(entries[0].toJSON){
                  obj.networkRequests = entries.map(function(e) {return e.toJSON();});
                }
              } catch (e) {
                //do nothing
              }
            }
          }

          hr_metrics.app_track('page-load-metrics', obj);
        }, 1000);
      });
    }
  

  $(window).on("load", function() {
      var _pathname = document.location.pathname;
      var cdn_url_switched = Cookies.get("cdn_url_switched");
      if (cdn_url_switched !== '') {
        Cookies.remove('cdn_url_switched');
      }
      hr_metrics.batch_track('PageLoad', _pathname + document.location.search, {
          attribute1: _pathname,
          attribute6: cdn_url_switched,
          cdn_url: Cookies.get("cdn_url")
      });

      if (hr_metrics.track_dwell_time) {
          hr_metrics.track_dwell_time(_pathname);
          hr_metrics.set_navigation_data();
      }

      $(window).on('beforeunload', function(){

          var _pathname = document.location.pathname;
          hr_metrics.batch_track('PageClose', _pathname + document.location.search, {
              attribute2: _pathname
          });

          hr_metrics.track_dwell_time(_pathname, true);

          hr_metrics.batch_track_record(true);
      });

  });

</script>

<!-- Facebook SDK -->
<!-- Twitter SDK -->

<!-- track button clicks -->
<script>
    $(document).on('click', 'a, button, input, select, i, div, span, h5', null, function(e) {
        var src = e.currentTarget, $src = $(e.currentTarget);
        if ($src.attr('data-analytics')) {
            action = 'Click'; data = $src.attr('data-analytics');
        } else {
            return;
        }

        
          hr_metrics.batch_track(action, data, (function() {
              var params={};
              for (var _i=1; _i<=12; ++_i){
                  var _attr = 'data-attr'+_i;
                  if ($src.attr(_attr)){
                    params['attribute'+_i] = $src.attr(_attr);
                  }
              }
              var attributes = src.attributes, attr_length = src.attributes.length;
              for (var i = 0; i < attr_length; i++){
                var attribute = attributes[i];
                if (attribute.name.indexOf('data-attr-') === 0){
                  param_name = attribute.name.substr('data-attr-'.length);
                  if (param_name.length > 0) {
                    params[param_name] = attribute.value;
                  }
                }
              }
              return params;
          })());
        

        
          // google analytics
          _gaq.push(['_trackEvent', 'Events' , action, data])
        
    });

    $(document).on('AnalyticsEvent', function(e) {
        action = e.event_type || false;
        data = e.event_name || false;

        if (!action || !data) {
          return;
        }

        params = {}
        params['attribute1'] = e.event_value || ""
        params['attribute7'] = e.integer_event_value

        if (window.HR && window.HR.current_page) {
          params['attribute2'] = window.HR.current_page;
        }

        if (window.HR && window.HR.current_contest) {
          params['attribute3'] = window.HR.current_contest.get('name');
        }

        
            hr_metrics.batch_track(action, data, params);
        

        
          // google analytics
          _gaq.push(['_trackEvent', 'Events' , action, data]);
        
    });

  </script>
<!-- track button clicks end-->

<!-- Linkedin Insights -->




<div class="monaco-aria-container"><div class="monaco-alert" role="alert" aria-atomic="true" style="visibility: visible;">below, suggestion (occurred 2 times)</div><div class="monaco-status" role="status" aria-atomic="true"></div></div></body></html>