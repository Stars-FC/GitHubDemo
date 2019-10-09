package com.lntu.fc.githubdemo.mvp.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by FengChen on 2019/9/1.
 */
public class Repo {
    /**
     * total_count : 551343
     * incomplete_results : true
     * items : [{"id":5152285,"node_id":"MDEwOlJlcG9zaXRvcnk1MTUyMjg1","name":"okhttp","full_name":"square/okhttp","private":false,"owner":{"login":"square","id":82592,"node_id":"MDEyOk9yZ2FuaXphdGlvbjgyNTky","avatar_url":"https://avatars0.githubusercontent.com/u/82592?v=4","gravatar_id":"","url":"https://api.github.com/users/square","html_url":"https://github.com/square","followers_url":"https://api.github.com/users/square/followers","following_url":"https://api.github.com/users/square/following{/other_user}","gists_url":"https://api.github.com/users/square/gists{/gist_id}","starred_url":"https://api.github.com/users/square/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/square/subscriptions","organizations_url":"https://api.github.com/users/square/orgs","repos_url":"https://api.github.com/users/square/repos","events_url":"https://api.github.com/users/square/events{/privacy}","received_events_url":"https://api.github.com/users/square/received_events","type":"Organization","site_admin":false},"html_url":"https://github.com/square/okhttp","description":"An HTTP client for Android, Kotlin, and Java.","fork":false,"url":"https://api.github.com/repos/square/okhttp","forks_url":"https://api.github.com/repos/square/okhttp/forks","keys_url":"https://api.github.com/repos/square/okhttp/keys{/key_id}","collaborators_url":"https://api.github.com/repos/square/okhttp/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/square/okhttp/teams","hooks_url":"https://api.github.com/repos/square/okhttp/hooks","issue_events_url":"https://api.github.com/repos/square/okhttp/issues/events{/number}","events_url":"https://api.github.com/repos/square/okhttp/events","assignees_url":"https://api.github.com/repos/square/okhttp/assignees{/user}","branches_url":"https://api.github.com/repos/square/okhttp/branches{/branch}","tags_url":"https://api.github.com/repos/square/okhttp/tags","blobs_url":"https://api.github.com/repos/square/okhttp/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/square/okhttp/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/square/okhttp/git/refs{/sha}","trees_url":"https://api.github.com/repos/square/okhttp/git/trees{/sha}","statuses_url":"https://api.github.com/repos/square/okhttp/statuses/{sha}","languages_url":"https://api.github.com/repos/square/okhttp/languages","stargazers_url":"https://api.github.com/repos/square/okhttp/stargazers","contributors_url":"https://api.github.com/repos/square/okhttp/contributors","subscribers_url":"https://api.github.com/repos/square/okhttp/subscribers","subscription_url":"https://api.github.com/repos/square/okhttp/subscription","commits_url":"https://api.github.com/repos/square/okhttp/commits{/sha}","git_commits_url":"https://api.github.com/repos/square/okhttp/git/commits{/sha}","comments_url":"https://api.github.com/repos/square/okhttp/comments{/number}","issue_comment_url":"https://api.github.com/repos/square/okhttp/issues/comments{/number}","contents_url":"https://api.github.com/repos/square/okhttp/contents/{+path}","compare_url":"https://api.github.com/repos/square/okhttp/compare/{base}...{head}","merges_url":"https://api.github.com/repos/square/okhttp/merges","archive_url":"https://api.github.com/repos/square/okhttp/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/square/okhttp/downloads","issues_url":"https://api.github.com/repos/square/okhttp/issues{/number}","pulls_url":"https://api.github.com/repos/square/okhttp/pulls{/number}","milestones_url":"https://api.github.com/repos/square/okhttp/milestones{/number}","notifications_url":"https://api.github.com/repos/square/okhttp/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/square/okhttp/labels{/name}","releases_url":"https://api.github.com/repos/square/okhttp/releases{/id}","deployments_url":"https://api.github.com/repos/square/okhttp/deployments","created_at":"2012-07-23T13:42:55Z","updated_at":"2019-09-01T06:52:14Z","pushed_at":"2019-08-31T06:43:24Z","git_url":"git://github.com/square/okhttp.git","ssh_url":"git@github.com:square/okhttp.git","clone_url":"https://github.com/square/okhttp.git","svn_url":"https://github.com/square/okhttp","homepage":"http://square.github.io/okhttp/","size":27316,"stargazers_count":34110,"watchers_count":34110,"language":"Java","has_issues":true,"has_projects":false,"has_downloads":true,"has_wiki":true,"has_pages":true,"forks_count":7429,"mirror_url":null,"archived":false,"disabled":false,"open_issues_count":188,"license":{"key":"apache-2.0","name":"Apache License 2.0","spdx_id":"Apache-2.0","url":"https://api.github.com/licenses/apache-2.0","node_id":"MDc6TGljZW5zZTI="},"forks":7429,"open_issues":188,"watchers":34110,"default_branch":"master","score":52.360664},{"id":892275,"node_id":"MDEwOlJlcG9zaXRvcnk4OTIyNzU=","name":"retrofit","full_name":"square/retrofit","private":false,"owner":{"login":"square","id":82592,"node_id":"MDEyOk9yZ2FuaXphdGlvbjgyNTky","avatar_url":"https://avatars0.githubusercontent.com/u/82592?v=4","gravatar_id":"","url":"https://api.github.com/users/square","html_url":"https://github.com/square","followers_url":"https://api.github.com/users/square/followers","following_url":"https://api.github.com/users/square/following{/other_user}","gists_url":"https://api.github.com/users/square/gists{/gist_id}","starred_url":"https://api.github.com/users/square/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/square/subscriptions","organizations_url":"https://api.github.com/users/square/orgs","repos_url":"https://api.github.com/users/square/repos","events_url":"https://api.github.com/users/square/events{/privacy}","received_events_url":"https://api.github.com/users/square/received_events","type":"Organization","site_admin":false},"html_url":"https://github.com/square/retrofit","description":"Type-safe HTTP client for Android and Java by Square, Inc.","fork":false,"url":"https://api.github.com/repos/square/retrofit","forks_url":"https://api.github.com/repos/square/retrofit/forks","keys_url":"https://api.github.com/repos/square/retrofit/keys{/key_id}","collaborators_url":"https://api.github.com/repos/square/retrofit/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/square/retrofit/teams","hooks_url":"https://api.github.com/repos/square/retrofit/hooks","issue_events_url":"https://api.github.com/repos/square/retrofit/issues/events{/number}","events_url":"https://api.github.com/repos/square/retrofit/events","assignees_url":"https://api.github.com/repos/square/retrofit/assignees{/user}","branches_url":"https://api.github.com/repos/square/retrofit/branches{/branch}","tags_url":"https://api.github.com/repos/square/retrofit/tags","blobs_url":"https://api.github.com/repos/square/retrofit/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/square/retrofit/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/square/retrofit/git/refs{/sha}","trees_url":"https://api.github.com/repos/square/retrofit/git/trees{/sha}","statuses_url":"https://api.github.com/repos/square/retrofit/statuses/{sha}","languages_url":"https://api.github.com/repos/square/retrofit/languages","stargazers_url":"https://api.github.com/repos/square/retrofit/stargazers","contributors_url":"https://api.github.com/repos/square/retrofit/contributors","subscribers_url":"https://api.github.com/repos/square/retrofit/subscribers","subscription_url":"https://api.github.com/repos/square/retrofit/subscription","commits_url":"https://api.github.com/repos/square/retrofit/commits{/sha}","git_commits_url":"https://api.github.com/repos/square/retrofit/git/commits{/sha}","comments_url":"https://api.github.com/repos/square/retrofit/comments{/number}","issue_comment_url":"https://api.github.com/repos/square/retrofit/issues/comments{/number}","contents_url":"https://api.github.com/repos/square/retrofit/contents/{+path}","compare_url":"https://api.github.com/repos/square/retrofit/compare/{base}...{head}","merges_url":"https://api.github.com/repos/square/retrofit/merges","archive_url":"https://api.github.com/repos/square/retrofit/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/square/retrofit/downloads","issues_url":"https://api.github.com/repos/square/retrofit/issues{/number}","pulls_url":"https://api.github.com/repos/square/retrofit/pulls{/number}","milestones_url":"https://api.github.com/repos/square/retrofit/milestones{/number}","notifications_url":"https://api.github.com/repos/square/retrofit/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/square/retrofit/labels{/name}","releases_url":"https://api.github.com/repos/square/retrofit/releases{/id}","deployments_url":"https://api.github.com/repos/square/retrofit/deployments","created_at":"2010-09-06T21:39:43Z","updated_at":"2019-09-01T02:38:57Z","pushed_at":"2019-08-07T12:12:24Z","git_url":"git://github.com/square/retrofit.git","ssh_url":"git@github.com:square/retrofit.git","clone_url":"https://github.com/square/retrofit.git","svn_url":"https://github.com/square/retrofit","homepage":"http://square.github.io/retrofit/","size":4988,"stargazers_count":33531,"watchers_count":33531,"language":"Java","has_issues":true,"has_projects":false,"has_downloads":true,"has_wiki":true,"has_pages":true,"forks_count":6208,"mirror_url":null,"archived":false,"disabled":false,"open_issues_count":79,"license":{"key":"apache-2.0","name":"Apache License 2.0","spdx_id":"Apache-2.0","url":"https://api.github.com/licenses/apache-2.0","node_id":"MDc6TGljZW5zZTI="},"forks":6208,"open_issues":79,"watchers":33531,"default_branch":"master","score":42.186184},{"id":19148949,"node_id":"MDEwOlJlcG9zaXRvcnkxOTE0ODk0OQ==","name":"MPAndroidChart","full_name":"PhilJay/MPAndroidChart","private":false,"owner":{"login":"PhilJay","id":6759734,"node_id":"MDQ6VXNlcjY3NTk3MzQ=","avatar_url":"https://avatars1.githubusercontent.com/u/6759734?v=4","gravatar_id":"","url":"https://api.github.com/users/PhilJay","html_url":"https://github.com/PhilJay","followers_url":"https://api.github.com/users/PhilJay/followers","following_url":"https://api.github.com/users/PhilJay/following{/other_user}","gists_url":"https://api.github.com/users/PhilJay/gists{/gist_id}","starred_url":"https://api.github.com/users/PhilJay/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/PhilJay/subscriptions","organizations_url":"https://api.github.com/users/PhilJay/orgs","repos_url":"https://api.github.com/users/PhilJay/repos","events_url":"https://api.github.com/users/PhilJay/events{/privacy}","received_events_url":"https://api.github.com/users/PhilJay/received_events","type":"User","site_admin":false},"html_url":"https://github.com/PhilJay/MPAndroidChart","description":"A powerful 🚀 Android chart view / graph view library, supporting line- bar- pie- radar- bubble- and candlestick charts as well as scaling, dragging and animations.","fork":false,"url":"https://api.github.com/repos/PhilJay/MPAndroidChart","forks_url":"https://api.github.com/repos/PhilJay/MPAndroidChart/forks","keys_url":"https://api.github.com/repos/PhilJay/MPAndroidChart/keys{/key_id}","collaborators_url":"https://api.github.com/repos/PhilJay/MPAndroidChart/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/PhilJay/MPAndroidChart/teams","hooks_url":"https://api.github.com/repos/PhilJay/MPAndroidChart/hooks","issue_events_url":"https://api.github.com/repos/PhilJay/MPAndroidChart/issues/events{/number}","events_url":"https://api.github.com/repos/PhilJay/MPAndroidChart/events","assignees_url":"https://api.github.com/repos/PhilJay/MPAndroidChart/assignees{/user}","branches_url":"https://api.github.com/repos/PhilJay/MPAndroidChart/branches{/branch}","tags_url":"https://api.github.com/repos/PhilJay/MPAndroidChart/tags","blobs_url":"https://api.github.com/repos/PhilJay/MPAndroidChart/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/PhilJay/MPAndroidChart/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/PhilJay/MPAndroidChart/git/refs{/sha}","trees_url":"https://api.github.com/repos/PhilJay/MPAndroidChart/git/trees{/sha}","statuses_url":"https://api.github.com/repos/PhilJay/MPAndroidChart/statuses/{sha}","languages_url":"https://api.github.com/repos/PhilJay/MPAndroidChart/languages","stargazers_url":"https://api.github.com/repos/PhilJay/MPAndroidChart/stargazers","contributors_url":"https://api.github.com/repos/PhilJay/MPAndroidChart/contributors","subscribers_url":"https://api.github.com/repos/PhilJay/MPAndroidChart/subscribers","subscription_url":"https://api.github.com/repos/PhilJay/MPAndroidChart/subscription","commits_url":"https://api.github.com/repos/PhilJay/MPAndroidChart/commits{/sha}","git_commits_url":"https://api.github.com/repos/PhilJay/MPAndroidChart/git/commits{/sha}","comments_url":"https://api.github.com/repos/PhilJay/MPAndroidChart/comments{/number}","issue_comment_url":"https://api.github.com/repos/PhilJay/MPAndroidChart/issues/comments{/number}","contents_url":"https://api.github.com/repos/PhilJay/MPAndroidChart/contents/{+path}","compare_url":"https://api.github.com/repos/PhilJay/MPAndroidChart/compare/{base}...{head}","merges_url":"https://api.github.com/repos/PhilJay/MPAndroidChart/merges","archive_url":"https://api.github.com/repos/PhilJay/MPAndroidChart/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/PhilJay/MPAndroidChart/downloads","issues_url":"https://api.github.com/repos/PhilJay/MPAndroidChart/issues{/number}","pulls_url":"https://api.github.com/repos/PhilJay/MPAndroidChart/pulls{/number}","milestones_url":"https://api.github.com/repos/PhilJay/MPAndroidChart/milestones{/number}","notifications_url":"https://api.github.com/repos/PhilJay/MPAndroidChart/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/PhilJay/MPAndroidChart/labels{/name}","releases_url":"https://api.github.com/repos/PhilJay/MPAndroidChart/releases{/id}","deployments_url":"https://api.github.com/repos/PhilJay/MPAndroidChart/deployments","created_at":"2014-04-25T14:29:47Z","updated_at":"2019-08-31T18:31:34Z","pushed_at":"2019-08-26T17:05:29Z","git_url":"git://github.com/PhilJay/MPAndroidChart.git","ssh_url":"git@github.com:PhilJay/MPAndroidChart.git","clone_url":"https://github.com/PhilJay/MPAndroidChart.git","svn_url":"https://github.com/PhilJay/MPAndroidChart","homepage":"","size":21264,"stargazers_count":28352,"watchers_count":28352,"language":"Java","has_issues":true,"has_projects":true,"has_downloads":true,"has_wiki":true,"has_pages":false,"forks_count":7348,"mirror_url":null,"archived":false,"disabled":false,"open_issues_count":1566,"license":{"key":"apache-2.0","name":"Apache License 2.0","spdx_id":"Apache-2.0","url":"https://api.github.com/licenses/apache-2.0","node_id":"MDc6TGljZW5zZTI="},"forks":7348,"open_issues":1566,"watchers":28352,"default_branch":"master","score":30.365917},{"id":11267509,"node_id":"MDEwOlJlcG9zaXRvcnkxMTI2NzUwOQ==","name":"glide","full_name":"bumptech/glide","private":false,"owner":{"login":"bumptech","id":423539,"node_id":"MDEyOk9yZ2FuaXphdGlvbjQyMzUzOQ==","avatar_url":"https://avatars0.githubusercontent.com/u/423539?v=4","gravatar_id":"","url":"https://api.github.com/users/bumptech","html_url":"https://github.com/bumptech","followers_url":"https://api.github.com/users/bumptech/followers","following_url":"https://api.github.com/users/bumptech/following{/other_user}","gists_url":"https://api.github.com/users/bumptech/gists{/gist_id}","starred_url":"https://api.github.com/users/bumptech/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/bumptech/subscriptions","organizations_url":"https://api.github.com/users/bumptech/orgs","repos_url":"https://api.github.com/users/bumptech/repos","events_url":"https://api.github.com/users/bumptech/events{/privacy}","received_events_url":"https://api.github.com/users/bumptech/received_events","type":"Organization","site_admin":false},"html_url":"https://github.com/bumptech/glide","description":"An image loading and caching library for Android focused on smooth scrolling","fork":false,"url":"https://api.github.com/repos/bumptech/glide","forks_url":"https://api.github.com/repos/bumptech/glide/forks","keys_url":"https://api.github.com/repos/bumptech/glide/keys{/key_id}","collaborators_url":"https://api.github.com/repos/bumptech/glide/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/bumptech/glide/teams","hooks_url":"https://api.github.com/repos/bumptech/glide/hooks","issue_events_url":"https://api.github.com/repos/bumptech/glide/issues/events{/number}","events_url":"https://api.github.com/repos/bumptech/glide/events","assignees_url":"https://api.github.com/repos/bumptech/glide/assignees{/user}","branches_url":"https://api.github.com/repos/bumptech/glide/branches{/branch}","tags_url":"https://api.github.com/repos/bumptech/glide/tags","blobs_url":"https://api.github.com/repos/bumptech/glide/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/bumptech/glide/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/bumptech/glide/git/refs{/sha}","trees_url":"https://api.github.com/repos/bumptech/glide/git/trees{/sha}","statuses_url":"https://api.github.com/repos/bumptech/glide/statuses/{sha}","languages_url":"https://api.github.com/repos/bumptech/glide/languages","stargazers_url":"https://api.github.com/repos/bumptech/glide/stargazers","contributors_url":"https://api.github.com/repos/bumptech/glide/contributors","subscribers_url":"https://api.github.com/repos/bumptech/glide/subscribers","subscription_url":"https://api.github.com/repos/bumptech/glide/subscription","commits_url":"https://api.github.com/repos/bumptech/glide/commits{/sha}","git_commits_url":"https://api.github.com/repos/bumptech/glide/git/commits{/sha}","comments_url":"https://api.github.com/repos/bumptech/glide/comments{/number}","issue_comment_url":"https://api.github.com/repos/bumptech/glide/issues/comments{/number}","contents_url":"https://api.github.com/repos/bumptech/glide/contents/{+path}","compare_url":"https://api.github.com/repos/bumptech/glide/compare/{base}...{head}","merges_url":"https://api.github.com/repos/bumptech/glide/merges","archive_url":"https://api.github.com/repos/bumptech/glide/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/bumptech/glide/downloads","issues_url":"https://api.github.com/repos/bumptech/glide/issues{/number}","pulls_url":"https://api.github.com/repos/bumptech/glide/pulls{/number}","milestones_url":"https://api.github.com/repos/bumptech/glide/milestones{/number}","notifications_url":"https://api.github.com/repos/bumptech/glide/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/bumptech/glide/labels{/name}","releases_url":"https://api.github.com/repos/bumptech/glide/releases{/id}","deployments_url":"https://api.github.com/repos/bumptech/glide/deployments","created_at":"2013-07-08T22:52:33Z","updated_at":"2019-09-01T06:45:24Z","pushed_at":"2019-08-30T23:49:18Z","git_url":"git://github.com/bumptech/glide.git","ssh_url":"git@github.com:bumptech/glide.git","clone_url":"https://github.com/bumptech/glide.git","svn_url":"https://github.com/bumptech/glide","homepage":"https://bumptech.github.io/glide/","size":63236,"stargazers_count":27028,"watchers_count":27028,"language":"Java","has_issues":true,"has_projects":true,"has_downloads":true,"has_wiki":true,"has_pages":true,"forks_count":4985,"mirror_url":null,"archived":false,"disabled":false,"open_issues_count":146,"license":{"key":"other","name":"Other","spdx_id":"NOASSERTION","url":null,"node_id":"MDc6TGljZW5zZTA="},"forks":4985,"open_issues":146,"watchers":27028,"default_branch":"master","score":41.17035},{"id":70198875,"node_id":"MDEwOlJlcG9zaXRvcnk3MDE5ODg3NQ==","name":"lottie-android","full_name":"airbnb/lottie-android","private":false,"owner":{"login":"airbnb","id":698437,"node_id":"MDEyOk9yZ2FuaXphdGlvbjY5ODQzNw==","avatar_url":"https://avatars3.githubusercontent.com/u/698437?v=4","gravatar_id":"","url":"https://api.github.com/users/airbnb","html_url":"https://github.com/airbnb","followers_url":"https://api.github.com/users/airbnb/followers","following_url":"https://api.github.com/users/airbnb/following{/other_user}","gists_url":"https://api.github.com/users/airbnb/gists{/gist_id}","starred_url":"https://api.github.com/users/airbnb/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/airbnb/subscriptions","organizations_url":"https://api.github.com/users/airbnb/orgs","repos_url":"https://api.github.com/users/airbnb/repos","events_url":"https://api.github.com/users/airbnb/events{/privacy}","received_events_url":"https://api.github.com/users/airbnb/received_events","type":"Organization","site_admin":false},"html_url":"https://github.com/airbnb/lottie-android","description":"Render After Effects animations natively on Android and iOS, Web, and React Native","fork":false,"url":"https://api.github.com/repos/airbnb/lottie-android","forks_url":"https://api.github.com/repos/airbnb/lottie-android/forks","keys_url":"https://api.github.com/repos/airbnb/lottie-android/keys{/key_id}","collaborators_url":"https://api.github.com/repos/airbnb/lottie-android/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/airbnb/lottie-android/teams","hooks_url":"https://api.github.com/repos/airbnb/lottie-android/hooks","issue_events_url":"https://api.github.com/repos/airbnb/lottie-android/issues/events{/number}","events_url":"https://api.github.com/repos/airbnb/lottie-android/events","assignees_url":"https://api.github.com/repos/airbnb/lottie-android/assignees{/user}","branches_url":"https://api.github.com/repos/airbnb/lottie-android/branches{/branch}","tags_url":"https://api.github.com/repos/airbnb/lottie-android/tags","blobs_url":"https://api.github.com/repos/airbnb/lottie-android/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/airbnb/lottie-android/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/airbnb/lottie-android/git/refs{/sha}","trees_url":"https://api.github.com/repos/airbnb/lottie-android/git/trees{/sha}","statuses_url":"https://api.github.com/repos/airbnb/lottie-android/statuses/{sha}","languages_url":"https://api.github.com/repos/airbnb/lottie-android/languages","stargazers_url":"https://api.github.com/repos/airbnb/lottie-android/stargazers","contributors_url":"https://api.github.com/repos/airbnb/lottie-android/contributors","subscribers_url":"https://api.github.com/repos/airbnb/lottie-android/subscribers","subscription_url":"https://api.github.com/repos/airbnb/lottie-android/subscription","commits_url":"https://api.github.com/repos/airbnb/lottie-android/commits{/sha}","git_commits_url":"https://api.github.com/repos/airbnb/lottie-android/git/commits{/sha}","comments_url":"https://api.github.com/repos/airbnb/lottie-android/comments{/number}","issue_comment_url":"https://api.github.com/repos/airbnb/lottie-android/issues/comments{/number}","contents_url":"https://api.github.com/repos/airbnb/lottie-android/contents/{+path}","compare_url":"https://api.github.com/repos/airbnb/lottie-android/compare/{base}...{head}","merges_url":"https://api.github.com/repos/airbnb/lottie-android/merges","archive_url":"https://api.github.com/repos/airbnb/lottie-android/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/airbnb/lottie-android/downloads","issues_url":"https://api.github.com/repos/airbnb/lottie-android/issues{/number}","pulls_url":"https://api.github.com/repos/airbnb/lottie-android/pulls{/number}","milestones_url":"https://api.github.com/repos/airbnb/lottie-android/milestones{/number}","notifications_url":"https://api.github.com/repos/airbnb/lottie-android/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/airbnb/lottie-android/labels{/name}","releases_url":"https://api.github.com/repos/airbnb/lottie-android/releases{/id}","deployments_url":"https://api.github.com/repos/airbnb/lottie-android/deployments","created_at":"2016-10-06T22:42:42Z","updated_at":"2019-09-01T07:11:26Z","pushed_at":"2019-08-31T16:22:51Z","git_url":"git://github.com/airbnb/lottie-android.git","ssh_url":"git@github.com:airbnb/lottie-android.git","clone_url":"https://github.com/airbnb/lottie-android.git","svn_url":"https://github.com/airbnb/lottie-android","homepage":"http://airbnb.io/lottie/","size":134058,"stargazers_count":26650,"watchers_count":26650,"language":"Java","has_issues":true,"has_projects":false,"has_downloads":true,"has_wiki":false,"has_pages":false,"forks_count":4201,"mirror_url":null,"archived":false,"disabled":false,"open_issues_count":25,"license":{"key":"apache-2.0","name":"Apache License 2.0","spdx_id":"Apache-2.0","url":"https://api.github.com/licenses/apache-2.0","node_id":"MDc6TGljZW5zZTI="},"forks":4201,"open_issues":25,"watchers":26650,"default_branch":"master","score":72.28306},{"id":64558143,"node_id":"MDEwOlJlcG9zaXRvcnk2NDU1ODE0Mw==","name":"AndroidUtilCode","full_name":"Blankj/AndroidUtilCode","private":false,"owner":{"login":"Blankj","id":17978187,"node_id":"MDQ6VXNlcjE3OTc4MTg3","avatar_url":"https://avatars3.githubusercontent.com/u/17978187?v=4","gravatar_id":"","url":"https://api.github.com/users/Blankj","html_url":"https://github.com/Blankj","followers_url":"https://api.github.com/users/Blankj/followers","following_url":"https://api.github.com/users/Blankj/following{/other_user}","gists_url":"https://api.github.com/users/Blankj/gists{/gist_id}","starred_url":"https://api.github.com/users/Blankj/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/Blankj/subscriptions","organizations_url":"https://api.github.com/users/Blankj/orgs","repos_url":"https://api.github.com/users/Blankj/repos","events_url":"https://api.github.com/users/Blankj/events{/privacy}","received_events_url":"https://api.github.com/users/Blankj/received_events","type":"User","site_admin":false},"html_url":"https://github.com/Blankj/AndroidUtilCode","description":":fire: Android developers should collect the following utils(updating).","fork":false,"url":"https://api.github.com/repos/Blankj/AndroidUtilCode","forks_url":"https://api.github.com/repos/Blankj/AndroidUtilCode/forks","keys_url":"https://api.github.com/repos/Blankj/AndroidUtilCode/keys{/key_id}","collaborators_url":"https://api.github.com/repos/Blankj/AndroidUtilCode/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/Blankj/AndroidUtilCode/teams","hooks_url":"https://api.github.com/repos/Blankj/AndroidUtilCode/hooks","issue_events_url":"https://api.github.com/repos/Blankj/AndroidUtilCode/issues/events{/number}","events_url":"https://api.github.com/repos/Blankj/AndroidUtilCode/events","assignees_url":"https://api.github.com/repos/Blankj/AndroidUtilCode/assignees{/user}","branches_url":"https://api.github.com/repos/Blankj/AndroidUtilCode/branches{/branch}","tags_url":"https://api.github.com/repos/Blankj/AndroidUtilCode/tags","blobs_url":"https://api.github.com/repos/Blankj/AndroidUtilCode/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/Blankj/AndroidUtilCode/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/Blankj/AndroidUtilCode/git/refs{/sha}","trees_url":"https://api.github.com/repos/Blankj/AndroidUtilCode/git/trees{/sha}","statuses_url":"https://api.github.com/repos/Blankj/AndroidUtilCode/statuses/{sha}","languages_url":"https://api.github.com/repos/Blankj/AndroidUtilCode/languages","stargazers_url":"https://api.github.com/repos/Blankj/AndroidUtilCode/stargazers","contributors_url":"https://api.github.com/repos/Blankj/AndroidUtilCode/contributors","subscribers_url":"https://api.github.com/repos/Blankj/AndroidUtilCode/subscribers","subscription_url":"https://api.github.com/repos/Blankj/AndroidUtilCode/subscription","commits_url":"https://api.github.com/repos/Blankj/AndroidUtilCode/commits{/sha}","git_commits_url":"https://api.github.com/repos/Blankj/AndroidUtilCode/git/commits{/sha}","comments_url":"https://api.github.com/repos/Blankj/AndroidUtilCode/comments{/number}","issue_comment_url":"https://api.github.com/repos/Blankj/AndroidUtilCode/issues/comments{/number}","contents_url":"https://api.github.com/repos/Blankj/AndroidUtilCode/contents/{+path}","compare_url":"https://api.github.com/repos/Blankj/AndroidUtilCode/compare/{base}...{head}","merges_url":"https://api.github.com/repos/Blankj/AndroidUtilCode/merges","archive_url":"https://api.github.com/repos/Blankj/AndroidUtilCode/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/Blankj/AndroidUtilCode/downloads","issues_url":"https://api.github.com/repos/Blankj/AndroidUtilCode/issues{/number}","pulls_url":"https://api.github.com/repos/Blankj/AndroidUtilCode/pulls{/number}","milestones_url":"https://api.github.com/repos/Blankj/AndroidUtilCode/milestones{/number}","notifications_url":"https://api.github.com/repos/Blankj/AndroidUtilCode/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/Blankj/AndroidUtilCode/labels{/name}","releases_url":"https://api.github.com/repos/Blankj/AndroidUtilCode/releases{/id}","deployments_url":"https://api.github.com/repos/Blankj/AndroidUtilCode/deployments","created_at":"2016-07-30T18:18:32Z","updated_at":"2019-08-31T20:00:17Z","pushed_at":"2019-08-29T07:04:06Z","git_url":"git://github.com/Blankj/AndroidUtilCode.git","ssh_url":"git@github.com:Blankj/AndroidUtilCode.git","clone_url":"https://github.com/Blankj/AndroidUtilCode.git","svn_url":"https://github.com/Blankj/AndroidUtilCode","homepage":"https://blankj.com/2016/07/31/android-utils-code/","size":46012,"stargazers_count":24662,"watchers_count":24662,"language":"Java","has_issues":true,"has_projects":false,"has_downloads":true,"has_wiki":false,"has_pages":true,"forks_count":8112,"mirror_url":null,"archived":false,"disabled":false,"open_issues_count":20,"license":{"key":"apache-2.0","name":"Apache License 2.0","spdx_id":"Apache-2.0","url":"https://api.github.com/licenses/apache-2.0","node_id":"MDc6TGljZW5zZTI="},"forks":8112,"open_issues":20,"watchers":24662,"default_branch":"master","score":86.24827},{"id":2562751,"node_id":"MDEwOlJlcG9zaXRvcnkyNTYyNzUx","name":"zxing","full_name":"zxing/zxing","private":false,"owner":{"login":"zxing","id":1122572,"node_id":"MDEyOk9yZ2FuaXphdGlvbjExMjI1NzI=","avatar_url":"https://avatars1.githubusercontent.com/u/1122572?v=4","gravatar_id":"","url":"https://api.github.com/users/zxing","html_url":"https://github.com/zxing","followers_url":"https://api.github.com/users/zxing/followers","following_url":"https://api.github.com/users/zxing/following{/other_user}","gists_url":"https://api.github.com/users/zxing/gists{/gist_id}","starred_url":"https://api.github.com/users/zxing/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/zxing/subscriptions","organizations_url":"https://api.github.com/users/zxing/orgs","repos_url":"https://api.github.com/users/zxing/repos","events_url":"https://api.github.com/users/zxing/events{/privacy}","received_events_url":"https://api.github.com/users/zxing/received_events","type":"Organization","site_admin":false},"html_url":"https://github.com/zxing/zxing","description":"ZXing (\"Zebra Crossing\") barcode scanning library for Java, Android","fork":false,"url":"https://api.github.com/repos/zxing/zxing","forks_url":"https://api.github.com/repos/zxing/zxing/forks","keys_url":"https://api.github.com/repos/zxing/zxing/keys{/key_id}","collaborators_url":"https://api.github.com/repos/zxing/zxing/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/zxing/zxing/teams","hooks_url":"https://api.github.com/repos/zxing/zxing/hooks","issue_events_url":"https://api.github.com/repos/zxing/zxing/issues/events{/number}","events_url":"https://api.github.com/repos/zxing/zxing/events","assignees_url":"https://api.github.com/repos/zxing/zxing/assignees{/user}","branches_url":"https://api.github.com/repos/zxing/zxing/branches{/branch}","tags_url":"https://api.github.com/repos/zxing/zxing/tags","blobs_url":"https://api.github.com/repos/zxing/zxing/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/zxing/zxing/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/zxing/zxing/git/refs{/sha}","trees_url":"https://api.github.com/repos/zxing/zxing/git/trees{/sha}","statuses_url":"https://api.github.com/repos/zxing/zxing/statuses/{sha}","languages_url":"https://api.github.com/repos/zxing/zxing/languages","stargazers_url":"https://api.github.com/repos/zxing/zxing/stargazers","contributors_url":"https://api.github.com/repos/zxing/zxing/contributors","subscribers_url":"https://api.github.com/repos/zxing/zxing/subscribers","subscription_url":"https://api.github.com/repos/zxing/zxing/subscription","commits_url":"https://api.github.com/repos/zxing/zxing/commits{/sha}","git_commits_url":"https://api.github.com/repos/zxing/zxing/git/commits{/sha}","comments_url":"https://api.github.com/repos/zxing/zxing/comments{/number}","issue_comment_url":"https://api.github.com/repos/zxing/zxing/issues/comments{/number}","contents_url":"https://api.github.com/repos/zxing/zxing/contents/{+path}","compare_url":"https://api.github.com/repos/zxing/zxing/compare/{base}...{head}","merges_url":"https://api.github.com/repos/zxing/zxing/merges","archive_url":"https://api.github.com/repos/zxing/zxing/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/zxing/zxing/downloads","issues_url":"https://api.github.com/repos/zxing/zxing/issues{/number}","pulls_url":"https://api.github.com/repos/zxing/zxing/pulls{/number}","milestones_url":"https://api.github.com/repos/zxing/zxing/milestones{/number}","notifications_url":"https://api.github.com/repos/zxing/zxing/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/zxing/zxing/labels{/name}","releases_url":"https://api.github.com/repos/zxing/zxing/releases{/id}","deployments_url":"https://api.github.com/repos/zxing/zxing/deployments","created_at":"2011-10-12T14:07:27Z","updated_at":"2019-09-01T02:43:28Z","pushed_at":"2019-07-29T19:52:47Z","git_url":"git://github.com/zxing/zxing.git","ssh_url":"git@github.com:zxing/zxing.git","clone_url":"https://github.com/zxing/zxing.git","svn_url":"https://github.com/zxing/zxing","homepage":"","size":239979,"stargazers_count":23471,"watchers_count":23471,"language":"Java","has_issues":true,"has_projects":false,"has_downloads":true,"has_wiki":true,"has_pages":true,"forks_count":8316,"mirror_url":null,"archived":false,"disabled":false,"open_issues_count":9,"license":{"key":"apache-2.0","name":"Apache License 2.0","spdx_id":"Apache-2.0","url":"https://api.github.com/licenses/apache-2.0","node_id":"MDc6TGljZW5zZTI="},"forks":8316,"open_issues":9,"watchers":23471,"default_branch":"master","score":52.26087},{"id":5070389,"node_id":"MDEwOlJlcG9zaXRvcnk1MDcwMzg5","name":"EventBus","full_name":"greenrobot/EventBus","private":false,"owner":{"login":"greenrobot","id":242242,"node_id":"MDQ6VXNlcjI0MjI0Mg==","avatar_url":"https://avatars0.githubusercontent.com/u/242242?v=4","gravatar_id":"","url":"https://api.github.com/users/greenrobot","html_url":"https://github.com/greenrobot","followers_url":"https://api.github.com/users/greenrobot/followers","following_url":"https://api.github.com/users/greenrobot/following{/other_user}","gists_url":"https://api.github.com/users/greenrobot/gists{/gist_id}","starred_url":"https://api.github.com/users/greenrobot/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/greenrobot/subscriptions","organizations_url":"https://api.github.com/users/greenrobot/orgs","repos_url":"https://api.github.com/users/greenrobot/repos","events_url":"https://api.github.com/users/greenrobot/events{/privacy}","received_events_url":"https://api.github.com/users/greenrobot/received_events","type":"User","site_admin":false},"html_url":"https://github.com/greenrobot/EventBus","description":"Event bus for Android and Java that simplifies communication between Activities, Fragments, Threads, Services, etc. Less code, better quality.","fork":false,"url":"https://api.github.com/repos/greenrobot/EventBus","forks_url":"https://api.github.com/repos/greenrobot/EventBus/forks","keys_url":"https://api.github.com/repos/greenrobot/EventBus/keys{/key_id}","collaborators_url":"https://api.github.com/repos/greenrobot/EventBus/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/greenrobot/EventBus/teams","hooks_url":"https://api.github.com/repos/greenrobot/EventBus/hooks","issue_events_url":"https://api.github.com/repos/greenrobot/EventBus/issues/events{/number}","events_url":"https://api.github.com/repos/greenrobot/EventBus/events","assignees_url":"https://api.github.com/repos/greenrobot/EventBus/assignees{/user}","branches_url":"https://api.github.com/repos/greenrobot/EventBus/branches{/branch}","tags_url":"https://api.github.com/repos/greenrobot/EventBus/tags","blobs_url":"https://api.github.com/repos/greenrobot/EventBus/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/greenrobot/EventBus/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/greenrobot/EventBus/git/refs{/sha}","trees_url":"https://api.github.com/repos/greenrobot/EventBus/git/trees{/sha}","statuses_url":"https://api.github.com/repos/greenrobot/EventBus/statuses/{sha}","languages_url":"https://api.github.com/repos/greenrobot/EventBus/languages","stargazers_url":"https://api.github.com/repos/greenrobot/EventBus/stargazers","contributors_url":"https://api.github.com/repos/greenrobot/EventBus/contributors","subscribers_url":"https://api.github.com/repos/greenrobot/EventBus/subscribers","subscription_url":"https://api.github.com/repos/greenrobot/EventBus/subscription","commits_url":"https://api.github.com/repos/greenrobot/EventBus/commits{/sha}","git_commits_url":"https://api.github.com/repos/greenrobot/EventBus/git/commits{/sha}","comments_url":"https://api.github.com/repos/greenrobot/EventBus/comments{/number}","issue_comment_url":"https://api.github.com/repos/greenrobot/EventBus/issues/comments{/number}","contents_url":"https://api.github.com/repos/greenrobot/EventBus/contents/{+path}","compare_url":"https://api.github.com/repos/greenrobot/EventBus/compare/{base}...{head}","merges_url":"https://api.github.com/repos/greenrobot/EventBus/merges","archive_url":"https://api.github.com/repos/greenrobot/EventBus/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/greenrobot/EventBus/downloads","issues_url":"https://api.github.com/repos/greenrobot/EventBus/issues{/number}","pulls_url":"https://api.github.com/repos/greenrobot/EventBus/pulls{/number}","milestones_url":"https://api.github.com/repos/greenrobot/EventBus/milestones{/number}","notifications_url":"https://api.github.com/repos/greenrobot/EventBus/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/greenrobot/EventBus/labels{/name}","releases_url":"https://api.github.com/repos/greenrobot/EventBus/releases{/id}","deployments_url":"https://api.github.com/repos/greenrobot/EventBus/deployments","created_at":"2012-07-16T16:55:40Z","updated_at":"2019-09-01T06:38:26Z","pushed_at":"2019-06-12T00:40:34Z","git_url":"git://github.com/greenrobot/EventBus.git","ssh_url":"git@github.com:greenrobot/EventBus.git","clone_url":"https://github.com/greenrobot/EventBus.git","svn_url":"https://github.com/greenrobot/EventBus","homepage":"http://greenrobot.org/eventbus/","size":1560,"stargazers_count":21528,"watchers_count":21528,"language":"Java","has_issues":true,"has_projects":true,"has_downloads":true,"has_wiki":true,"has_pages":true,"forks_count":4364,"mirror_url":null,"archived":false,"disabled":false,"open_issues_count":120,"license":{"key":"apache-2.0","name":"Apache License 2.0","spdx_id":"Apache-2.0","url":"https://api.github.com/licenses/apache-2.0","node_id":"MDc6TGljZW5zZTI="},"forks":4364,"open_issues":120,"watchers":21528,"default_branch":"master","score":35.288708},{"id":93152223,"node_id":"MDEwOlJlcG9zaXRvcnk5MzE1MjIyMw==","name":"SmartRefreshLayout","full_name":"scwang90/SmartRefreshLayout","private":false,"owner":{"login":"scwang90","id":11567071,"node_id":"MDQ6VXNlcjExNTY3MDcx","avatar_url":"https://avatars0.githubusercontent.com/u/11567071?v=4","gravatar_id":"","url":"https://api.github.com/users/scwang90","html_url":"https://github.com/scwang90","followers_url":"https://api.github.com/users/scwang90/followers","following_url":"https://api.github.com/users/scwang90/following{/other_user}","gists_url":"https://api.github.com/users/scwang90/gists{/gist_id}","starred_url":"https://api.github.com/users/scwang90/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/scwang90/subscriptions","organizations_url":"https://api.github.com/users/scwang90/orgs","repos_url":"https://api.github.com/users/scwang90/repos","events_url":"https://api.github.com/users/scwang90/events{/privacy}","received_events_url":"https://api.github.com/users/scwang90/received_events","type":"User","site_admin":false},"html_url":"https://github.com/scwang90/SmartRefreshLayout","description":"🔥下拉刷新、上拉加载、二级刷新、淘宝二楼、RefreshLayout、OverScroll，Android智能下拉刷新框架，支持越界回弹、越界拖动，具有极强的扩展性，集成了几十种炫酷的Header和 Footer。","fork":false,"url":"https://api.github.com/repos/scwang90/SmartRefreshLayout","forks_url":"https://api.github.com/repos/scwang90/SmartRefreshLayout/forks","keys_url":"https://api.github.com/repos/scwang90/SmartRefreshLayout/keys{/key_id}","collaborators_url":"https://api.github.com/repos/scwang90/SmartRefreshLayout/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/scwang90/SmartRefreshLayout/teams","hooks_url":"https://api.github.com/repos/scwang90/SmartRefreshLayout/hooks","issue_events_url":"https://api.github.com/repos/scwang90/SmartRefreshLayout/issues/events{/number}","events_url":"https://api.github.com/repos/scwang90/SmartRefreshLayout/events","assignees_url":"https://api.github.com/repos/scwang90/SmartRefreshLayout/assignees{/user}","branches_url":"https://api.github.com/repos/scwang90/SmartRefreshLayout/branches{/branch}","tags_url":"https://api.github.com/repos/scwang90/SmartRefreshLayout/tags","blobs_url":"https://api.github.com/repos/scwang90/SmartRefreshLayout/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/scwang90/SmartRefreshLayout/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/scwang90/SmartRefreshLayout/git/refs{/sha}","trees_url":"https://api.github.com/repos/scwang90/SmartRefreshLayout/git/trees{/sha}","statuses_url":"https://api.github.com/repos/scwang90/SmartRefreshLayout/statuses/{sha}","languages_url":"https://api.github.com/repos/scwang90/SmartRefreshLayout/languages","stargazers_url":"https://api.github.com/repos/scwang90/SmartRefreshLayout/stargazers","contributors_url":"https://api.github.com/repos/scwang90/SmartRefreshLayout/contributors","subscribers_url":"https://api.github.com/repos/scwang90/SmartRefreshLayout/subscribers","subscription_url":"https://api.github.com/repos/scwang90/SmartRefreshLayout/subscription","commits_url":"https://api.github.com/repos/scwang90/SmartRefreshLayout/commits{/sha}","git_commits_url":"https://api.github.com/repos/scwang90/SmartRefreshLayout/git/commits{/sha}","comments_url":"https://api.github.com/repos/scwang90/SmartRefreshLayout/comments{/number}","issue_comment_url":"https://api.github.com/repos/scwang90/SmartRefreshLayout/issues/comments{/number}","contents_url":"https://api.github.com/repos/scwang90/SmartRefreshLayout/contents/{+path}","compare_url":"https://api.github.com/repos/scwang90/SmartRefreshLayout/compare/{base}...{head}","merges_url":"https://api.github.com/repos/scwang90/SmartRefreshLayout/merges","archive_url":"https://api.github.com/repos/scwang90/SmartRefreshLayout/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/scwang90/SmartRefreshLayout/downloads","issues_url":"https://api.github.com/repos/scwang90/SmartRefreshLayout/issues{/number}","pulls_url":"https://api.github.com/repos/scwang90/SmartRefreshLayout/pulls{/number}","milestones_url":"https://api.github.com/repos/scwang90/SmartRefreshLayout/milestones{/number}","notifications_url":"https://api.github.com/repos/scwang90/SmartRefreshLayout/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/scwang90/SmartRefreshLayout/labels{/name}","releases_url":"https://api.github.com/repos/scwang90/SmartRefreshLayout/releases{/id}","deployments_url":"https://api.github.com/repos/scwang90/SmartRefreshLayout/deployments","created_at":"2017-06-02T09:52:50Z","updated_at":"2019-09-01T05:35:49Z","pushed_at":"2019-08-19T16:53:51Z","git_url":"git://github.com/scwang90/SmartRefreshLayout.git","ssh_url":"git@github.com:scwang90/SmartRefreshLayout.git","clone_url":"https://github.com/scwang90/SmartRefreshLayout.git","svn_url":"https://github.com/scwang90/SmartRefreshLayout","homepage":"https://segmentfault.com/a/1190000010066071","size":268402,"stargazers_count":18572,"watchers_count":18572,"language":"Java","has_issues":true,"has_projects":true,"has_downloads":true,"has_wiki":true,"has_pages":false,"forks_count":3853,"mirror_url":null,"archived":false,"disabled":false,"open_issues_count":39,"license":{"key":"apache-2.0","name":"Apache License 2.0","spdx_id":"Apache-2.0","url":"https://api.github.com/licenses/apache-2.0","node_id":"MDc6TGljZW5zZTI="},"forks":3853,"open_issues":39,"watchers":18572,"default_branch":"release","score":15.961832},{"id":23095954,"node_id":"MDEwOlJlcG9zaXRvcnkyMzA5NTk1NA==","name":"RxAndroid","full_name":"ReactiveX/RxAndroid","private":false,"owner":{"login":"ReactiveX","id":6407041,"node_id":"MDEyOk9yZ2FuaXphdGlvbjY0MDcwNDE=","avatar_url":"https://avatars1.githubusercontent.com/u/6407041?v=4","gravatar_id":"","url":"https://api.github.com/users/ReactiveX","html_url":"https://github.com/ReactiveX","followers_url":"https://api.github.com/users/ReactiveX/followers","following_url":"https://api.github.com/users/ReactiveX/following{/other_user}","gists_url":"https://api.github.com/users/ReactiveX/gists{/gist_id}","starred_url":"https://api.github.com/users/ReactiveX/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/ReactiveX/subscriptions","organizations_url":"https://api.github.com/users/ReactiveX/orgs","repos_url":"https://api.github.com/users/ReactiveX/repos","events_url":"https://api.github.com/users/ReactiveX/events{/privacy}","received_events_url":"https://api.github.com/users/ReactiveX/received_events","type":"Organization","site_admin":false},"html_url":"https://github.com/ReactiveX/RxAndroid","description":"RxJava bindings for Android","fork":false,"url":"https://api.github.com/repos/ReactiveX/RxAndroid","forks_url":"https://api.github.com/repos/ReactiveX/RxAndroid/forks","keys_url":"https://api.github.com/repos/ReactiveX/RxAndroid/keys{/key_id}","collaborators_url":"https://api.github.com/repos/ReactiveX/RxAndroid/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/ReactiveX/RxAndroid/teams","hooks_url":"https://api.github.com/repos/ReactiveX/RxAndroid/hooks","issue_events_url":"https://api.github.com/repos/ReactiveX/RxAndroid/issues/events{/number}","events_url":"https://api.github.com/repos/ReactiveX/RxAndroid/events","assignees_url":"https://api.github.com/repos/ReactiveX/RxAndroid/assignees{/user}","branches_url":"https://api.github.com/repos/ReactiveX/RxAndroid/branches{/branch}","tags_url":"https://api.github.com/repos/ReactiveX/RxAndroid/tags","blobs_url":"https://api.github.com/repos/ReactiveX/RxAndroid/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/ReactiveX/RxAndroid/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/ReactiveX/RxAndroid/git/refs{/sha}","trees_url":"https://api.github.com/repos/ReactiveX/RxAndroid/git/trees{/sha}","statuses_url":"https://api.github.com/repos/ReactiveX/RxAndroid/statuses/{sha}","languages_url":"https://api.github.com/repos/ReactiveX/RxAndroid/languages","stargazers_url":"https://api.github.com/repos/ReactiveX/RxAndroid/stargazers","contributors_url":"https://api.github.com/repos/ReactiveX/RxAndroid/contributors","subscribers_url":"https://api.github.com/repos/ReactiveX/RxAndroid/subscribers","subscription_url":"https://api.github.com/repos/ReactiveX/RxAndroid/subscription","commits_url":"https://api.github.com/repos/ReactiveX/RxAndroid/commits{/sha}","git_commits_url":"https://api.github.com/repos/ReactiveX/RxAndroid/git/commits{/sha}","comments_url":"https://api.github.com/repos/ReactiveX/RxAndroid/comments{/number}","issue_comment_url":"https://api.github.com/repos/ReactiveX/RxAndroid/issues/comments{/number}","contents_url":"https://api.github.com/repos/ReactiveX/RxAndroid/contents/{+path}","compare_url":"https://api.github.com/repos/ReactiveX/RxAndroid/compare/{base}...{head}","merges_url":"https://api.github.com/repos/ReactiveX/RxAndroid/merges","archive_url":"https://api.github.com/repos/ReactiveX/RxAndroid/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/ReactiveX/RxAndroid/downloads","issues_url":"https://api.github.com/repos/ReactiveX/RxAndroid/issues{/number}","pulls_url":"https://api.github.com/repos/ReactiveX/RxAndroid/pulls{/number}","milestones_url":"https://api.github.com/repos/ReactiveX/RxAndroid/milestones{/number}","notifications_url":"https://api.github.com/repos/ReactiveX/RxAndroid/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/ReactiveX/RxAndroid/labels{/name}","releases_url":"https://api.github.com/repos/ReactiveX/RxAndroid/releases{/id}","deployments_url":"https://api.github.com/repos/ReactiveX/RxAndroid/deployments","created_at":"2014-08-19T03:46:38Z","updated_at":"2019-09-01T02:25:05Z","pushed_at":"2019-06-25T12:31:46Z","git_url":"git://github.com/ReactiveX/RxAndroid.git","ssh_url":"git@github.com:ReactiveX/RxAndroid.git","clone_url":"https://github.com/ReactiveX/RxAndroid.git","svn_url":"https://github.com/ReactiveX/RxAndroid","homepage":"","size":845,"stargazers_count":18410,"watchers_count":18410,"language":"Java","has_issues":true,"has_projects":false,"has_downloads":true,"has_wiki":true,"has_pages":false,"forks_count":2843,"mirror_url":null,"archived":false,"disabled":false,"open_issues_count":1,"license":{"key":"apache-2.0","name":"Apache License 2.0","spdx_id":"Apache-2.0","url":"https://api.github.com/licenses/apache-2.0","node_id":"MDc6TGljZW5zZTI="},"forks":2843,"open_issues":1,"watchers":18410,"default_branch":"2.x","score":69.23357},{"id":2862290,"node_id":"MDEwOlJlcG9zaXRvcnkyODYyMjkw","name":"Android-Universal-Image-Loader","full_name":"nostra13/Android-Universal-Image-Loader","private":false,"owner":{"login":"nostra13","id":1223348,"node_id":"MDQ6VXNlcjEyMjMzNDg=","avatar_url":"https://avatars1.githubusercontent.com/u/1223348?v=4","gravatar_id":"","url":"https://api.github.com/users/nostra13","html_url":"https://github.com/nostra13","followers_url":"https://api.github.com/users/nostra13/followers","following_url":"https://api.github.com/users/nostra13/following{/other_user}","gists_url":"https://api.github.com/users/nostra13/gists{/gist_id}","starred_url":"https://api.github.com/users/nostra13/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/nostra13/subscriptions","organizations_url":"https://api.github.com/users/nostra13/orgs","repos_url":"https://api.github.com/users/nostra13/repos","events_url":"https://api.github.com/users/nostra13/events{/privacy}","received_events_url":"https://api.github.com/users/nostra13/received_events","type":"User","site_admin":false},"html_url":"https://github.com/nostra13/Android-Universal-Image-Loader","description":"Powerful and flexible library for loading, caching and displaying images on Android.","fork":false,"url":"https://api.github.com/repos/nostra13/Android-Universal-Image-Loader","forks_url":"https://api.github.com/repos/nostra13/Android-Universal-Image-Loader/forks","keys_url":"https://api.github.com/repos/nostra13/Android-Universal-Image-Loader/keys{/key_id}","collaborators_url":"https://api.github.com/repos/nostra13/Android-Universal-Image-Loader/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/nostra13/Android-Universal-Image-Loader/teams","hooks_url":"https://api.github.com/repos/nostra13/Android-Universal-Image-Loader/hooks","issue_events_url":"https://api.github.com/repos/nostra13/Android-Universal-Image-Loader/issues/events{/number}","events_url":"https://api.github.com/repos/nostra13/Android-Universal-Image-Loader/events","assignees_url":"https://api.github.com/repos/nostra13/Android-Universal-Image-Loader/assignees{/user}","branches_url":"https://api.github.com/repos/nostra13/Android-Universal-Image-Loader/branches{/branch}","tags_url":"https://api.github.com/repos/nostra13/Android-Universal-Image-Loader/tags","blobs_url":"https://api.github.com/repos/nostra13/Android-Universal-Image-Loader/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/nostra13/Android-Universal-Image-Loader/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/nostra13/Android-Universal-Image-Loader/git/refs{/sha}","trees_url":"https://api.github.com/repos/nostra13/Android-Universal-Image-Loader/git/trees{/sha}","statuses_url":"https://api.github.com/repos/nostra13/Android-Universal-Image-Loader/statuses/{sha}","languages_url":"https://api.github.com/repos/nostra13/Android-Universal-Image-Loader/languages","stargazers_url":"https://api.github.com/repos/nostra13/Android-Universal-Image-Loader/stargazers","contributors_url":"https://api.github.com/repos/nostra13/Android-Universal-Image-Loader/contributors","subscribers_url":"https://api.github.com/repos/nostra13/Android-Universal-Image-Loader/subscribers","subscription_url":"https://api.github.com/repos/nostra13/Android-Universal-Image-Loader/subscription","commits_url":"https://api.github.com/repos/nostra13/Android-Universal-Image-Loader/commits{/sha}","git_commits_url":"https://api.github.com/repos/nostra13/Android-Universal-Image-Loader/git/commits{/sha}","comments_url":"https://api.github.com/repos/nostra13/Android-Universal-Image-Loader/comments{/number}","issue_comment_url":"https://api.github.com/repos/nostra13/Android-Universal-Image-Loader/issues/comments{/number}","contents_url":"https://api.github.com/repos/nostra13/Android-Universal-Image-Loader/contents/{+path}","compare_url":"https://api.github.com/repos/nostra13/Android-Universal-Image-Loader/compare/{base}...{head}","merges_url":"https://api.github.com/repos/nostra13/Android-Universal-Image-Loader/merges","archive_url":"https://api.github.com/repos/nostra13/Android-Universal-Image-Loader/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/nostra13/Android-Universal-Image-Loader/downloads","issues_url":"https://api.github.com/repos/nostra13/Android-Universal-Image-Loader/issues{/number}","pulls_url":"https://api.github.com/repos/nostra13/Android-Universal-Image-Loader/pulls{/number}","milestones_url":"https://api.github.com/repos/nostra13/Android-Universal-Image-Loader/milestones{/number}","notifications_url":"https://api.github.com/repos/nostra13/Android-Universal-Image-Loader/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/nostra13/Android-Universal-Image-Loader/labels{/name}","releases_url":"https://api.github.com/repos/nostra13/Android-Universal-Image-Loader/releases{/id}","deployments_url":"https://api.github.com/repos/nostra13/Android-Universal-Image-Loader/deployments","created_at":"2011-11-27T18:48:23Z","updated_at":"2019-08-29T09:44:57Z","pushed_at":"2019-05-13T10:07:04Z","git_url":"git://github.com/nostra13/Android-Universal-Image-Loader.git","ssh_url":"git@github.com:nostra13/Android-Universal-Image-Loader.git","clone_url":"https://github.com/nostra13/Android-Universal-Image-Loader.git","svn_url":"https://github.com/nostra13/Android-Universal-Image-Loader","homepage":"","size":27119,"stargazers_count":16576,"watchers_count":16576,"language":"Java","has_issues":true,"has_projects":true,"has_downloads":true,"has_wiki":true,"has_pages":false,"forks_count":6355,"mirror_url":null,"archived":false,"disabled":false,"open_issues_count":451,"license":{"key":"apache-2.0","name":"Apache License 2.0","spdx_id":"Apache-2.0","url":"https://api.github.com/licenses/apache-2.0","node_id":"MDc6TGljZW5zZTI="},"forks":6355,"open_issues":451,"watchers":16576,"default_branch":"master","score":69.35102},{"id":5373551,"node_id":"MDEwOlJlcG9zaXRvcnk1MzczNTUx","name":"libgdx","full_name":"libgdx/libgdx","private":false,"owner":{"login":"libgdx","id":509841,"node_id":"MDEyOk9yZ2FuaXphdGlvbjUwOTg0MQ==","avatar_url":"https://avatars1.githubusercontent.com/u/509841?v=4","gravatar_id":"","url":"https://api.github.com/users/libgdx","html_url":"https://github.com/libgdx","followers_url":"https://api.github.com/users/libgdx/followers","following_url":"https://api.github.com/users/libgdx/following{/other_user}","gists_url":"https://api.github.com/users/libgdx/gists{/gist_id}","starred_url":"https://api.github.com/users/libgdx/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/libgdx/subscriptions","organizations_url":"https://api.github.com/users/libgdx/orgs","repos_url":"https://api.github.com/users/libgdx/repos","events_url":"https://api.github.com/users/libgdx/events{/privacy}","received_events_url":"https://api.github.com/users/libgdx/received_events","type":"Organization","site_admin":false},"html_url":"https://github.com/libgdx/libgdx","description":"Desktop/Android/HTML5/iOS Java game development framework","fork":false,"url":"https://api.github.com/repos/libgdx/libgdx","forks_url":"https://api.github.com/repos/libgdx/libgdx/forks","keys_url":"https://api.github.com/repos/libgdx/libgdx/keys{/key_id}","collaborators_url":"https://api.github.com/repos/libgdx/libgdx/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/libgdx/libgdx/teams","hooks_url":"https://api.github.com/repos/libgdx/libgdx/hooks","issue_events_url":"https://api.github.com/repos/libgdx/libgdx/issues/events{/number}","events_url":"https://api.github.com/repos/libgdx/libgdx/events","assignees_url":"https://api.github.com/repos/libgdx/libgdx/assignees{/user}","branches_url":"https://api.github.com/repos/libgdx/libgdx/branches{/branch}","tags_url":"https://api.github.com/repos/libgdx/libgdx/tags","blobs_url":"https://api.github.com/repos/libgdx/libgdx/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/libgdx/libgdx/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/libgdx/libgdx/git/refs{/sha}","trees_url":"https://api.github.com/repos/libgdx/libgdx/git/trees{/sha}","statuses_url":"https://api.github.com/repos/libgdx/libgdx/statuses/{sha}","languages_url":"https://api.github.com/repos/libgdx/libgdx/languages","stargazers_url":"https://api.github.com/repos/libgdx/libgdx/stargazers","contributors_url":"https://api.github.com/repos/libgdx/libgdx/contributors","subscribers_url":"https://api.github.com/repos/libgdx/libgdx/subscribers","subscription_url":"https://api.github.com/repos/libgdx/libgdx/subscription","commits_url":"https://api.github.com/repos/libgdx/libgdx/commits{/sha}","git_commits_url":"https://api.github.com/repos/libgdx/libgdx/git/commits{/sha}","comments_url":"https://api.github.com/repos/libgdx/libgdx/comments{/number}","issue_comment_url":"https://api.github.com/repos/libgdx/libgdx/issues/comments{/number}","contents_url":"https://api.github.com/repos/libgdx/libgdx/contents/{+path}","compare_url":"https://api.github.com/repos/libgdx/libgdx/compare/{base}...{head}","merges_url":"https://api.github.com/repos/libgdx/libgdx/merges","archive_url":"https://api.github.com/repos/libgdx/libgdx/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/libgdx/libgdx/downloads","issues_url":"https://api.github.com/repos/libgdx/libgdx/issues{/number}","pulls_url":"https://api.github.com/repos/libgdx/libgdx/pulls{/number}","milestones_url":"https://api.github.com/repos/libgdx/libgdx/milestones{/number}","notifications_url":"https://api.github.com/repos/libgdx/libgdx/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/libgdx/libgdx/labels{/name}","releases_url":"https://api.github.com/repos/libgdx/libgdx/releases{/id}","deployments_url":"https://api.github.com/repos/libgdx/libgdx/deployments","created_at":"2012-08-10T19:34:38Z","updated_at":"2019-09-01T05:13:23Z","pushed_at":"2019-08-31T22:18:25Z","git_url":"git://github.com/libgdx/libgdx.git","ssh_url":"git@github.com:libgdx/libgdx.git","clone_url":"https://github.com/libgdx/libgdx.git","svn_url":"https://github.com/libgdx/libgdx","homepage":"http://www.libgdx.com/","size":1069431,"stargazers_count":15831,"watchers_count":15831,"language":"Java","has_issues":true,"has_projects":true,"has_downloads":true,"has_wiki":true,"has_pages":false,"forks_count":5884,"mirror_url":null,"archived":false,"disabled":false,"open_issues_count":341,"license":{"key":"other","name":"Other","spdx_id":"NOASSERTION","url":null,"node_id":"MDc6TGljZW5zZTA="},"forks":5884,"open_issues":341,"watchers":15831,"default_branch":"master","score":50.52224},{"id":5084750,"node_id":"MDEwOlJlcG9zaXRvcnk1MDg0NzUw","name":"PhotoView","full_name":"chrisbanes/PhotoView","private":false,"owner":{"login":"chrisbanes","id":227486,"node_id":"MDQ6VXNlcjIyNzQ4Ng==","avatar_url":"https://avatars3.githubusercontent.com/u/227486?v=4","gravatar_id":"","url":"https://api.github.com/users/chrisbanes","html_url":"https://github.com/chrisbanes","followers_url":"https://api.github.com/users/chrisbanes/followers","following_url":"https://api.github.com/users/chrisbanes/following{/other_user}","gists_url":"https://api.github.com/users/chrisbanes/gists{/gist_id}","starred_url":"https://api.github.com/users/chrisbanes/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/chrisbanes/subscriptions","organizations_url":"https://api.github.com/users/chrisbanes/orgs","repos_url":"https://api.github.com/users/chrisbanes/repos","events_url":"https://api.github.com/users/chrisbanes/events{/privacy}","received_events_url":"https://api.github.com/users/chrisbanes/received_events","type":"User","site_admin":false},"html_url":"https://github.com/chrisbanes/PhotoView","description":"Implementation of ImageView for Android that supports zooming, by various touch gestures.","fork":false,"url":"https://api.github.com/repos/chrisbanes/PhotoView","forks_url":"https://api.github.com/repos/chrisbanes/PhotoView/forks","keys_url":"https://api.github.com/repos/chrisbanes/PhotoView/keys{/key_id}","collaborators_url":"https://api.github.com/repos/chrisbanes/PhotoView/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/chrisbanes/PhotoView/teams","hooks_url":"https://api.github.com/repos/chrisbanes/PhotoView/hooks","issue_events_url":"https://api.github.com/repos/chrisbanes/PhotoView/issues/events{/number}","events_url":"https://api.github.com/repos/chrisbanes/PhotoView/events","assignees_url":"https://api.github.com/repos/chrisbanes/PhotoView/assignees{/user}","branches_url":"https://api.github.com/repos/chrisbanes/PhotoView/branches{/branch}","tags_url":"https://api.github.com/repos/chrisbanes/PhotoView/tags","blobs_url":"https://api.github.com/repos/chrisbanes/PhotoView/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/chrisbanes/PhotoView/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/chrisbanes/PhotoView/git/refs{/sha}","trees_url":"https://api.github.com/repos/chrisbanes/PhotoView/git/trees{/sha}","statuses_url":"https://api.github.com/repos/chrisbanes/PhotoView/statuses/{sha}","languages_url":"https://api.github.com/repos/chrisbanes/PhotoView/languages","stargazers_url":"https://api.github.com/repos/chrisbanes/PhotoView/stargazers","contributors_url":"https://api.github.com/repos/chrisbanes/PhotoView/contributors","subscribers_url":"https://api.github.com/repos/chrisbanes/PhotoView/subscribers","subscription_url":"https://api.github.com/repos/chrisbanes/PhotoView/subscription","commits_url":"https://api.github.com/repos/chrisbanes/PhotoView/commits{/sha}","git_commits_url":"https://api.github.com/repos/chrisbanes/PhotoView/git/commits{/sha}","comments_url":"https://api.github.com/repos/chrisbanes/PhotoView/comments{/number}","issue_comment_url":"https://api.github.com/repos/chrisbanes/PhotoView/issues/comments{/number}","contents_url":"https://api.github.com/repos/chrisbanes/PhotoView/contents/{+path}","compare_url":"https://api.github.com/repos/chrisbanes/PhotoView/compare/{base}...{head}","merges_url":"https://api.github.com/repos/chrisbanes/PhotoView/merges","archive_url":"https://api.github.com/repos/chrisbanes/PhotoView/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/chrisbanes/PhotoView/downloads","issues_url":"https://api.github.com/repos/chrisbanes/PhotoView/issues{/number}","pulls_url":"https://api.github.com/repos/chrisbanes/PhotoView/pulls{/number}","milestones_url":"https://api.github.com/repos/chrisbanes/PhotoView/milestones{/number}","notifications_url":"https://api.github.com/repos/chrisbanes/PhotoView/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/chrisbanes/PhotoView/labels{/name}","releases_url":"https://api.github.com/repos/chrisbanes/PhotoView/releases{/id}","deployments_url":"https://api.github.com/repos/chrisbanes/PhotoView/deployments","created_at":"2012-07-17T16:39:00Z","updated_at":"2019-09-01T07:40:07Z","pushed_at":"2019-03-15T04:22:26Z","git_url":"git://github.com/chrisbanes/PhotoView.git","ssh_url":"git@github.com:chrisbanes/PhotoView.git","clone_url":"https://github.com/chrisbanes/PhotoView.git","svn_url":"https://github.com/chrisbanes/PhotoView","homepage":"","size":16802,"stargazers_count":15809,"watchers_count":15809,"language":"Java","has_issues":true,"has_projects":true,"has_downloads":true,"has_wiki":false,"has_pages":false,"forks_count":3590,"mirror_url":null,"archived":false,"disabled":false,"open_issues_count":133,"license":{"key":"apache-2.0","name":"Apache License 2.0","spdx_id":"Apache-2.0","url":"https://api.github.com/licenses/apache-2.0","node_id":"MDc6TGljZW5zZTI="},"forks":3590,"open_issues":133,"watchers":15809,"default_branch":"master","score":39.636314},{"id":31533997,"node_id":"MDEwOlJlcG9zaXRvcnkzMTUzMzk5Nw==","name":"fresco","full_name":"facebook/fresco","private":false,"owner":{"login":"facebook","id":69631,"node_id":"MDEyOk9yZ2FuaXphdGlvbjY5NjMx","avatar_url":"https://avatars3.githubusercontent.com/u/69631?v=4","gravatar_id":"","url":"https://api.github.com/users/facebook","html_url":"https://github.com/facebook","followers_url":"https://api.github.com/users/facebook/followers","following_url":"https://api.github.com/users/facebook/following{/other_user}","gists_url":"https://api.github.com/users/facebook/gists{/gist_id}","starred_url":"https://api.github.com/users/facebook/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/facebook/subscriptions","organizations_url":"https://api.github.com/users/facebook/orgs","repos_url":"https://api.github.com/users/facebook/repos","events_url":"https://api.github.com/users/facebook/events{/privacy}","received_events_url":"https://api.github.com/users/facebook/received_events","type":"Organization","site_admin":false},"html_url":"https://github.com/facebook/fresco","description":"An Android library for managing images and the memory they use.","fork":false,"url":"https://api.github.com/repos/facebook/fresco","forks_url":"https://api.github.com/repos/facebook/fresco/forks","keys_url":"https://api.github.com/repos/facebook/fresco/keys{/key_id}","collaborators_url":"https://api.github.com/repos/facebook/fresco/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/facebook/fresco/teams","hooks_url":"https://api.github.com/repos/facebook/fresco/hooks","issue_events_url":"https://api.github.com/repos/facebook/fresco/issues/events{/number}","events_url":"https://api.github.com/repos/facebook/fresco/events","assignees_url":"https://api.github.com/repos/facebook/fresco/assignees{/user}","branches_url":"https://api.github.com/repos/facebook/fresco/branches{/branch}","tags_url":"https://api.github.com/repos/facebook/fresco/tags","blobs_url":"https://api.github.com/repos/facebook/fresco/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/facebook/fresco/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/facebook/fresco/git/refs{/sha}","trees_url":"https://api.github.com/repos/facebook/fresco/git/trees{/sha}","statuses_url":"https://api.github.com/repos/facebook/fresco/statuses/{sha}","languages_url":"https://api.github.com/repos/facebook/fresco/languages","stargazers_url":"https://api.github.com/repos/facebook/fresco/stargazers","contributors_url":"https://api.github.com/repos/facebook/fresco/contributors","subscribers_url":"https://api.github.com/repos/facebook/fresco/subscribers","subscription_url":"https://api.github.com/repos/facebook/fresco/subscription","commits_url":"https://api.github.com/repos/facebook/fresco/commits{/sha}","git_commits_url":"https://api.github.com/repos/facebook/fresco/git/commits{/sha}","comments_url":"https://api.github.com/repos/facebook/fresco/comments{/number}","issue_comment_url":"https://api.github.com/repos/facebook/fresco/issues/comments{/number}","contents_url":"https://api.github.com/repos/facebook/fresco/contents/{+path}","compare_url":"https://api.github.com/repos/facebook/fresco/compare/{base}...{head}","merges_url":"https://api.github.com/repos/facebook/fresco/merges","archive_url":"https://api.github.com/repos/facebook/fresco/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/facebook/fresco/downloads","issues_url":"https://api.github.com/repos/facebook/fresco/issues{/number}","pulls_url":"https://api.github.com/repos/facebook/fresco/pulls{/number}","milestones_url":"https://api.github.com/repos/facebook/fresco/milestones{/number}","notifications_url":"https://api.github.com/repos/facebook/fresco/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/facebook/fresco/labels{/name}","releases_url":"https://api.github.com/repos/facebook/fresco/releases{/id}","deployments_url":"https://api.github.com/repos/facebook/fresco/deployments","created_at":"2015-03-02T09:58:04Z","updated_at":"2019-08-30T21:00:46Z","pushed_at":"2019-09-01T03:51:53Z","git_url":"git://github.com/facebook/fresco.git","ssh_url":"git@github.com:facebook/fresco.git","clone_url":"https://github.com/facebook/fresco.git","svn_url":"https://github.com/facebook/fresco","homepage":"https://frescolib.org/","size":69181,"stargazers_count":15803,"watchers_count":15803,"language":"Java","has_issues":true,"has_projects":true,"has_downloads":true,"has_wiki":true,"has_pages":true,"forks_count":3669,"mirror_url":null,"archived":false,"disabled":false,"open_issues_count":99,"license":{"key":"mit","name":"MIT License","spdx_id":"MIT","url":"https://api.github.com/licenses/mit","node_id":"MDc6TGljZW5zZTEz"},"forks":3669,"open_issues":99,"watchers":15803,"default_branch":"master","score":39.707424},{"id":67481986,"node_id":"MDEwOlJlcG9zaXRvcnk2NzQ4MTk4Ng==","name":"tinker","full_name":"Tencent/tinker","private":false,"owner":{"login":"Tencent","id":18461506,"node_id":"MDEyOk9yZ2FuaXphdGlvbjE4NDYxNTA2","avatar_url":"https://avatars3.githubusercontent.com/u/18461506?v=4","gravatar_id":"","url":"https://api.github.com/users/Tencent","html_url":"https://github.com/Tencent","followers_url":"https://api.github.com/users/Tencent/followers","following_url":"https://api.github.com/users/Tencent/following{/other_user}","gists_url":"https://api.github.com/users/Tencent/gists{/gist_id}","starred_url":"https://api.github.com/users/Tencent/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/Tencent/subscriptions","organizations_url":"https://api.github.com/users/Tencent/orgs","repos_url":"https://api.github.com/users/Tencent/repos","events_url":"https://api.github.com/users/Tencent/events{/privacy}","received_events_url":"https://api.github.com/users/Tencent/received_events","type":"Organization","site_admin":false},"html_url":"https://github.com/Tencent/tinker","description":"Tinker is a hot-fix solution library for Android, it supports dex, library and resources update without reinstall apk.","fork":false,"url":"https://api.github.com/repos/Tencent/tinker","forks_url":"https://api.github.com/repos/Tencent/tinker/forks","keys_url":"https://api.github.com/repos/Tencent/tinker/keys{/key_id}","collaborators_url":"https://api.github.com/repos/Tencent/tinker/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/Tencent/tinker/teams","hooks_url":"https://api.github.com/repos/Tencent/tinker/hooks","issue_events_url":"https://api.github.com/repos/Tencent/tinker/issues/events{/number}","events_url":"https://api.github.com/repos/Tencent/tinker/events","assignees_url":"https://api.github.com/repos/Tencent/tinker/assignees{/user}","branches_url":"https://api.github.com/repos/Tencent/tinker/branches{/branch}","tags_url":"https://api.github.com/repos/Tencent/tinker/tags","blobs_url":"https://api.github.com/repos/Tencent/tinker/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/Tencent/tinker/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/Tencent/tinker/git/refs{/sha}","trees_url":"https://api.github.com/repos/Tencent/tinker/git/trees{/sha}","statuses_url":"https://api.github.com/repos/Tencent/tinker/statuses/{sha}","languages_url":"https://api.github.com/repos/Tencent/tinker/languages","stargazers_url":"https://api.github.com/repos/Tencent/tinker/stargazers","contributors_url":"https://api.github.com/repos/Tencent/tinker/contributors","subscribers_url":"https://api.github.com/repos/Tencent/tinker/subscribers","subscription_url":"https://api.github.com/repos/Tencent/tinker/subscription","commits_url":"https://api.github.com/repos/Tencent/tinker/commits{/sha}","git_commits_url":"https://api.github.com/repos/Tencent/tinker/git/commits{/sha}","comments_url":"https://api.github.com/repos/Tencent/tinker/comments{/number}","issue_comment_url":"https://api.github.com/repos/Tencent/tinker/issues/comments{/number}","contents_url":"https://api.github.com/repos/Tencent/tinker/contents/{+path}","compare_url":"https://api.github.com/repos/Tencent/tinker/compare/{base}...{head}","merges_url":"https://api.github.com/repos/Tencent/tinker/merges","archive_url":"https://api.github.com/repos/Tencent/tinker/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/Tencent/tinker/downloads","issues_url":"https://api.github.com/repos/Tencent/tinker/issues{/number}","pulls_url":"https://api.github.com/repos/Tencent/tinker/pulls{/number}","milestones_url":"https://api.github.com/repos/Tencent/tinker/milestones{/number}","notifications_url":"https://api.github.com/repos/Tencent/tinker/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/Tencent/tinker/labels{/name}","releases_url":"https://api.github.com/repos/Tencent/tinker/releases{/id}","deployments_url":"https://api.github.com/repos/Tencent/tinker/deployments","created_at":"2016-09-06T06:57:52Z","updated_at":"2019-08-31T11:50:19Z","pushed_at":"2019-08-30T17:25:03Z","git_url":"git://github.com/Tencent/tinker.git","ssh_url":"git@github.com:Tencent/tinker.git","clone_url":"https://github.com/Tencent/tinker.git","svn_url":"https://github.com/Tencent/tinker","homepage":"","size":5316,"stargazers_count":14153,"watchers_count":14153,"language":"Java","has_issues":true,"has_projects":true,"has_downloads":true,"has_wiki":true,"has_pages":false,"forks_count":2860,"mirror_url":null,"archived":false,"disabled":false,"open_issues_count":160,"license":{"key":"other","name":"Other","spdx_id":"NOASSERTION","url":null,"node_id":"MDc6TGljZW5zZTA="},"forks":2860,"open_issues":160,"watchers":14153,"default_branch":"dev","score":33.560333},{"id":20818126,"node_id":"MDEwOlJlcG9zaXRvcnkyMDgxODEyNg==","name":"ExoPlayer","full_name":"google/ExoPlayer","private":false,"owner":{"login":"google","id":1342004,"node_id":"MDEyOk9yZ2FuaXphdGlvbjEzNDIwMDQ=","avatar_url":"https://avatars1.githubusercontent.com/u/1342004?v=4","gravatar_id":"","url":"https://api.github.com/users/google","html_url":"https://github.com/google","followers_url":"https://api.github.com/users/google/followers","following_url":"https://api.github.com/users/google/following{/other_user}","gists_url":"https://api.github.com/users/google/gists{/gist_id}","starred_url":"https://api.github.com/users/google/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/google/subscriptions","organizations_url":"https://api.github.com/users/google/orgs","repos_url":"https://api.github.com/users/google/repos","events_url":"https://api.github.com/users/google/events{/privacy}","received_events_url":"https://api.github.com/users/google/received_events","type":"Organization","site_admin":false},"html_url":"https://github.com/google/ExoPlayer","description":"An extensible media player for Android","fork":false,"url":"https://api.github.com/repos/google/ExoPlayer","forks_url":"https://api.github.com/repos/google/ExoPlayer/forks","keys_url":"https://api.github.com/repos/google/ExoPlayer/keys{/key_id}","collaborators_url":"https://api.github.com/repos/google/ExoPlayer/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/google/ExoPlayer/teams","hooks_url":"https://api.github.com/repos/google/ExoPlayer/hooks","issue_events_url":"https://api.github.com/repos/google/ExoPlayer/issues/events{/number}","events_url":"https://api.github.com/repos/google/ExoPlayer/events","assignees_url":"https://api.github.com/repos/google/ExoPlayer/assignees{/user}","branches_url":"https://api.github.com/repos/google/ExoPlayer/branches{/branch}","tags_url":"https://api.github.com/repos/google/ExoPlayer/tags","blobs_url":"https://api.github.com/repos/google/ExoPlayer/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/google/ExoPlayer/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/google/ExoPlayer/git/refs{/sha}","trees_url":"https://api.github.com/repos/google/ExoPlayer/git/trees{/sha}","statuses_url":"https://api.github.com/repos/google/ExoPlayer/statuses/{sha}","languages_url":"https://api.github.com/repos/google/ExoPlayer/languages","stargazers_url":"https://api.github.com/repos/google/ExoPlayer/stargazers","contributors_url":"https://api.github.com/repos/google/ExoPlayer/contributors","subscribers_url":"https://api.github.com/repos/google/ExoPlayer/subscribers","subscription_url":"https://api.github.com/repos/google/ExoPlayer/subscription","commits_url":"https://api.github.com/repos/google/ExoPlayer/commits{/sha}","git_commits_url":"https://api.github.com/repos/google/ExoPlayer/git/commits{/sha}","comments_url":"https://api.github.com/repos/google/ExoPlayer/comments{/number}","issue_comment_url":"https://api.github.com/repos/google/ExoPlayer/issues/comments{/number}","contents_url":"https://api.github.com/repos/google/ExoPlayer/contents/{+path}","compare_url":"https://api.github.com/repos/google/ExoPlayer/compare/{base}...{head}","merges_url":"https://api.github.com/repos/google/ExoPlayer/merges","archive_url":"https://api.github.com/repos/google/ExoPlayer/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/google/ExoPlayer/downloads","issues_url":"https://api.github.com/repos/google/ExoPlayer/issues{/number}","pulls_url":"https://api.github.com/repos/google/ExoPlayer/pulls{/number}","milestones_url":"https://api.github.com/repos/google/ExoPlayer/milestones{/number}","notifications_url":"https://api.github.com/repos/google/ExoPlayer/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/google/ExoPlayer/labels{/name}","releases_url":"https://api.github.com/repos/google/ExoPlayer/releases{/id}","deployments_url":"https://api.github.com/repos/google/ExoPlayer/deployments","created_at":"2014-06-13T21:19:18Z","updated_at":"2019-09-01T07:53:59Z","pushed_at":"2019-08-30T18:13:05Z","git_url":"git://github.com/google/ExoPlayer.git","ssh_url":"git@github.com:google/ExoPlayer.git","clone_url":"https://github.com/google/ExoPlayer.git","svn_url":"https://github.com/google/ExoPlayer","homepage":"","size":87433,"stargazers_count":13859,"watchers_count":13859,"language":"Java","has_issues":true,"has_projects":true,"has_downloads":true,"has_wiki":false,"has_pages":true,"forks_count":4164,"mirror_url":null,"archived":false,"disabled":false,"open_issues_count":363,"license":{"key":"apache-2.0","name":"Apache License 2.0","spdx_id":"Apache-2.0","url":"https://api.github.com/licenses/apache-2.0","node_id":"MDc6TGljZW5zZTI="},"forks":4164,"open_issues":363,"watchers":13859,"default_branch":"release-v2","score":55.74683},{"id":23112526,"node_id":"MDEwOlJlcG9zaXRvcnkyMzExMjUyNg==","name":"Android-CleanArchitecture","full_name":"android10/Android-CleanArchitecture","private":false,"owner":{"login":"android10","id":1360604,"node_id":"MDQ6VXNlcjEzNjA2MDQ=","avatar_url":"https://avatars0.githubusercontent.com/u/1360604?v=4","gravatar_id":"","url":"https://api.github.com/users/android10","html_url":"https://github.com/android10","followers_url":"https://api.github.com/users/android10/followers","following_url":"https://api.github.com/users/android10/following{/other_user}","gists_url":"https://api.github.com/users/android10/gists{/gist_id}","starred_url":"https://api.github.com/users/android10/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/android10/subscriptions","organizations_url":"https://api.github.com/users/android10/orgs","repos_url":"https://api.github.com/users/android10/repos","events_url":"https://api.github.com/users/android10/events{/privacy}","received_events_url":"https://api.github.com/users/android10/received_events","type":"User","site_admin":false},"html_url":"https://github.com/android10/Android-CleanArchitecture","description":"This is a sample app that is part of a series of blog posts I have written about how to architect an android application using Uncle Bob's clean architecture approach.","fork":false,"url":"https://api.github.com/repos/android10/Android-CleanArchitecture","forks_url":"https://api.github.com/repos/android10/Android-CleanArchitecture/forks","keys_url":"https://api.github.com/repos/android10/Android-CleanArchitecture/keys{/key_id}","collaborators_url":"https://api.github.com/repos/android10/Android-CleanArchitecture/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/android10/Android-CleanArchitecture/teams","hooks_url":"https://api.github.com/repos/android10/Android-CleanArchitecture/hooks","issue_events_url":"https://api.github.com/repos/android10/Android-CleanArchitecture/issues/events{/number}","events_url":"https://api.github.com/repos/android10/Android-CleanArchitecture/events","assignees_url":"https://api.github.com/repos/android10/Android-CleanArchitecture/assignees{/user}","branches_url":"https://api.github.com/repos/android10/Android-CleanArchitecture/branches{/branch}","tags_url":"https://api.github.com/repos/android10/Android-CleanArchitecture/tags","blobs_url":"https://api.github.com/repos/android10/Android-CleanArchitecture/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/android10/Android-CleanArchitecture/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/android10/Android-CleanArchitecture/git/refs{/sha}","trees_url":"https://api.github.com/repos/android10/Android-CleanArchitecture/git/trees{/sha}","statuses_url":"https://api.github.com/repos/android10/Android-CleanArchitecture/statuses/{sha}","languages_url":"https://api.github.com/repos/android10/Android-CleanArchitecture/languages","stargazers_url":"https://api.github.com/repos/android10/Android-CleanArchitecture/stargazers","contributors_url":"https://api.github.com/repos/android10/Android-CleanArchitecture/contributors","subscribers_url":"https://api.github.com/repos/android10/Android-CleanArchitecture/subscribers","subscription_url":"https://api.github.com/repos/android10/Android-CleanArchitecture/subscription","commits_url":"https://api.github.com/repos/android10/Android-CleanArchitecture/commits{/sha}","git_commits_url":"https://api.github.com/repos/android10/Android-CleanArchitecture/git/commits{/sha}","comments_url":"https://api.github.com/repos/android10/Android-CleanArchitecture/comments{/number}","issue_comment_url":"https://api.github.com/repos/android10/Android-CleanArchitecture/issues/comments{/number}","contents_url":"https://api.github.com/repos/android10/Android-CleanArchitecture/contents/{+path}","compare_url":"https://api.github.com/repos/android10/Android-CleanArchitecture/compare/{base}...{head}","merges_url":"https://api.github.com/repos/android10/Android-CleanArchitecture/merges","archive_url":"https://api.github.com/repos/android10/Android-CleanArchitecture/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/android10/Android-CleanArchitecture/downloads","issues_url":"https://api.github.com/repos/android10/Android-CleanArchitecture/issues{/number}","pulls_url":"https://api.github.com/repos/android10/Android-CleanArchitecture/pulls{/number}","milestones_url":"https://api.github.com/repos/android10/Android-CleanArchitecture/milestones{/number}","notifications_url":"https://api.github.com/repos/android10/Android-CleanArchitecture/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/android10/Android-CleanArchitecture/labels{/name}","releases_url":"https://api.github.com/repos/android10/Android-CleanArchitecture/releases{/id}","deployments_url":"https://api.github.com/repos/android10/Android-CleanArchitecture/deployments","created_at":"2014-08-19T14:09:26Z","updated_at":"2019-08-31T05:25:23Z","pushed_at":"2019-07-18T20:34:04Z","git_url":"git://github.com/android10/Android-CleanArchitecture.git","ssh_url":"git@github.com:android10/Android-CleanArchitecture.git","clone_url":"https://github.com/android10/Android-CleanArchitecture.git","svn_url":"https://github.com/android10/Android-CleanArchitecture","homepage":"","size":5182,"stargazers_count":13731,"watchers_count":13731,"language":"Java","has_issues":true,"has_projects":true,"has_downloads":true,"has_wiki":true,"has_pages":false,"forks_count":3150,"mirror_url":null,"archived":false,"disabled":false,"open_issues_count":140,"license":{"key":"apache-2.0","name":"Apache License 2.0","spdx_id":"Apache-2.0","url":"https://api.github.com/licenses/apache-2.0","node_id":"MDc6TGljZW5zZTI="},"forks":3150,"open_issues":140,"watchers":13731,"default_branch":"master","score":65.26012},{"id":31865176,"node_id":"MDEwOlJlcG9zaXRvcnkzMTg2NTE3Ng==","name":"Material-Animations","full_name":"lgvalle/Material-Animations","private":false,"owner":{"login":"lgvalle","id":354372,"node_id":"MDQ6VXNlcjM1NDM3Mg==","avatar_url":"https://avatars0.githubusercontent.com/u/354372?v=4","gravatar_id":"","url":"https://api.github.com/users/lgvalle","html_url":"https://github.com/lgvalle","followers_url":"https://api.github.com/users/lgvalle/followers","following_url":"https://api.github.com/users/lgvalle/following{/other_user}","gists_url":"https://api.github.com/users/lgvalle/gists{/gist_id}","starred_url":"https://api.github.com/users/lgvalle/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/lgvalle/subscriptions","organizations_url":"https://api.github.com/users/lgvalle/orgs","repos_url":"https://api.github.com/users/lgvalle/repos","events_url":"https://api.github.com/users/lgvalle/events{/privacy}","received_events_url":"https://api.github.com/users/lgvalle/received_events","type":"User","site_admin":false},"html_url":"https://github.com/lgvalle/Material-Animations","description":"Android Transition animations explanation with examples.","fork":false,"url":"https://api.github.com/repos/lgvalle/Material-Animations","forks_url":"https://api.github.com/repos/lgvalle/Material-Animations/forks","keys_url":"https://api.github.com/repos/lgvalle/Material-Animations/keys{/key_id}","collaborators_url":"https://api.github.com/repos/lgvalle/Material-Animations/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/lgvalle/Material-Animations/teams","hooks_url":"https://api.github.com/repos/lgvalle/Material-Animations/hooks","issue_events_url":"https://api.github.com/repos/lgvalle/Material-Animations/issues/events{/number}","events_url":"https://api.github.com/repos/lgvalle/Material-Animations/events","assignees_url":"https://api.github.com/repos/lgvalle/Material-Animations/assignees{/user}","branches_url":"https://api.github.com/repos/lgvalle/Material-Animations/branches{/branch}","tags_url":"https://api.github.com/repos/lgvalle/Material-Animations/tags","blobs_url":"https://api.github.com/repos/lgvalle/Material-Animations/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/lgvalle/Material-Animations/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/lgvalle/Material-Animations/git/refs{/sha}","trees_url":"https://api.github.com/repos/lgvalle/Material-Animations/git/trees{/sha}","statuses_url":"https://api.github.com/repos/lgvalle/Material-Animations/statuses/{sha}","languages_url":"https://api.github.com/repos/lgvalle/Material-Animations/languages","stargazers_url":"https://api.github.com/repos/lgvalle/Material-Animations/stargazers","contributors_url":"https://api.github.com/repos/lgvalle/Material-Animations/contributors","subscribers_url":"https://api.github.com/repos/lgvalle/Material-Animations/subscribers","subscription_url":"https://api.github.com/repos/lgvalle/Material-Animations/subscription","commits_url":"https://api.github.com/repos/lgvalle/Material-Animations/commits{/sha}","git_commits_url":"https://api.github.com/repos/lgvalle/Material-Animations/git/commits{/sha}","comments_url":"https://api.github.com/repos/lgvalle/Material-Animations/comments{/number}","issue_comment_url":"https://api.github.com/repos/lgvalle/Material-Animations/issues/comments{/number}","contents_url":"https://api.github.com/repos/lgvalle/Material-Animations/contents/{+path}","compare_url":"https://api.github.com/repos/lgvalle/Material-Animations/compare/{base}...{head}","merges_url":"https://api.github.com/repos/lgvalle/Material-Animations/merges","archive_url":"https://api.github.com/repos/lgvalle/Material-Animations/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/lgvalle/Material-Animations/downloads","issues_url":"https://api.github.com/repos/lgvalle/Material-Animations/issues{/number}","pulls_url":"https://api.github.com/repos/lgvalle/Material-Animations/pulls{/number}","milestones_url":"https://api.github.com/repos/lgvalle/Material-Animations/milestones{/number}","notifications_url":"https://api.github.com/repos/lgvalle/Material-Animations/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/lgvalle/Material-Animations/labels{/name}","releases_url":"https://api.github.com/repos/lgvalle/Material-Animations/releases{/id}","deployments_url":"https://api.github.com/repos/lgvalle/Material-Animations/deployments","created_at":"2015-03-08T20:54:00Z","updated_at":"2019-09-01T00:08:14Z","pushed_at":"2019-04-02T15:42:38Z","git_url":"git://github.com/lgvalle/Material-Animations.git","ssh_url":"git@github.com:lgvalle/Material-Animations.git","clone_url":"https://github.com/lgvalle/Material-Animations.git","svn_url":"https://github.com/lgvalle/Material-Animations","homepage":"","size":8692,"stargazers_count":12982,"watchers_count":12982,"language":"Java","has_issues":true,"has_projects":true,"has_downloads":true,"has_wiki":true,"has_pages":false,"forks_count":2535,"mirror_url":null,"archived":false,"disabled":false,"open_issues_count":19,"license":{"key":"mit","name":"MIT License","spdx_id":"MIT","url":"https://api.github.com/licenses/mit","node_id":"MDc6TGljZW5zZTEz"},"forks":2535,"open_issues":19,"watchers":12982,"default_branch":"master","score":53.443836},{"id":13862381,"node_id":"MDEwOlJlcG9zaXRvcnkxMzg2MjM4MQ==","name":"Telegram","full_name":"DrKLO/Telegram","private":false,"owner":{"login":"DrKLO","id":69369,"node_id":"MDQ6VXNlcjY5MzY5","avatar_url":"https://avatars2.githubusercontent.com/u/69369?v=4","gravatar_id":"","url":"https://api.github.com/users/DrKLO","html_url":"https://github.com/DrKLO","followers_url":"https://api.github.com/users/DrKLO/followers","following_url":"https://api.github.com/users/DrKLO/following{/other_user}","gists_url":"https://api.github.com/users/DrKLO/gists{/gist_id}","starred_url":"https://api.github.com/users/DrKLO/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/DrKLO/subscriptions","organizations_url":"https://api.github.com/users/DrKLO/orgs","repos_url":"https://api.github.com/users/DrKLO/repos","events_url":"https://api.github.com/users/DrKLO/events{/privacy}","received_events_url":"https://api.github.com/users/DrKLO/received_events","type":"User","site_admin":false},"html_url":"https://github.com/DrKLO/Telegram","description":"Telegram for Android source","fork":false,"url":"https://api.github.com/repos/DrKLO/Telegram","forks_url":"https://api.github.com/repos/DrKLO/Telegram/forks","keys_url":"https://api.github.com/repos/DrKLO/Telegram/keys{/key_id}","collaborators_url":"https://api.github.com/repos/DrKLO/Telegram/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/DrKLO/Telegram/teams","hooks_url":"https://api.github.com/repos/DrKLO/Telegram/hooks","issue_events_url":"https://api.github.com/repos/DrKLO/Telegram/issues/events{/number}","events_url":"https://api.github.com/repos/DrKLO/Telegram/events","assignees_url":"https://api.github.com/repos/DrKLO/Telegram/assignees{/user}","branches_url":"https://api.github.com/repos/DrKLO/Telegram/branches{/branch}","tags_url":"https://api.github.com/repos/DrKLO/Telegram/tags","blobs_url":"https://api.github.com/repos/DrKLO/Telegram/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/DrKLO/Telegram/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/DrKLO/Telegram/git/refs{/sha}","trees_url":"https://api.github.com/repos/DrKLO/Telegram/git/trees{/sha}","statuses_url":"https://api.github.com/repos/DrKLO/Telegram/statuses/{sha}","languages_url":"https://api.github.com/repos/DrKLO/Telegram/languages","stargazers_url":"https://api.github.com/repos/DrKLO/Telegram/stargazers","contributors_url":"https://api.github.com/repos/DrKLO/Telegram/contributors","subscribers_url":"https://api.github.com/repos/DrKLO/Telegram/subscribers","subscription_url":"https://api.github.com/repos/DrKLO/Telegram/subscription","commits_url":"https://api.github.com/repos/DrKLO/Telegram/commits{/sha}","git_commits_url":"https://api.github.com/repos/DrKLO/Telegram/git/commits{/sha}","comments_url":"https://api.github.com/repos/DrKLO/Telegram/comments{/number}","issue_comment_url":"https://api.github.com/repos/DrKLO/Telegram/issues/comments{/number}","contents_url":"https://api.github.com/repos/DrKLO/Telegram/contents/{+path}","compare_url":"https://api.github.com/repos/DrKLO/Telegram/compare/{base}...{head}","merges_url":"https://api.github.com/repos/DrKLO/Telegram/merges","archive_url":"https://api.github.com/repos/DrKLO/Telegram/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/DrKLO/Telegram/downloads","issues_url":"https://api.github.com/repos/DrKLO/Telegram/issues{/number}","pulls_url":"https://api.github.com/repos/DrKLO/Telegram/pulls{/number}","milestones_url":"https://api.github.com/repos/DrKLO/Telegram/milestones{/number}","notifications_url":"https://api.github.com/repos/DrKLO/Telegram/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/DrKLO/Telegram/labels{/name}","releases_url":"https://api.github.com/repos/DrKLO/Telegram/releases{/id}","deployments_url":"https://api.github.com/repos/DrKLO/Telegram/deployments","created_at":"2013-10-25T14:08:10Z","updated_at":"2019-09-01T07:18:42Z","pushed_at":"2019-08-30T03:35:55Z","git_url":"git://github.com/DrKLO/Telegram.git","ssh_url":"git@github.com:DrKLO/Telegram.git","clone_url":"https://github.com/DrKLO/Telegram.git","svn_url":"https://github.com/DrKLO/Telegram","homepage":null,"size":177529,"stargazers_count":12399,"watchers_count":12399,"language":"Java","has_issues":false,"has_projects":true,"has_downloads":true,"has_wiki":false,"has_pages":false,"forks_count":4794,"mirror_url":null,"archived":false,"disabled":false,"open_issues_count":392,"license":{"key":"gpl-2.0","name":"GNU General Public License v2.0","spdx_id":"GPL-2.0","url":"https://api.github.com/licenses/gpl-2.0","node_id":"MDc6TGljZW5zZTg="},"forks":4794,"open_issues":392,"watchers":12399,"default_branch":"master","score":65.063805},{"id":2990192,"node_id":"MDEwOlJlcG9zaXRvcnkyOTkwMTky","name":"Signal-Android","full_name":"signalapp/Signal-Android","private":false,"owner":{"login":"signalapp","id":702459,"node_id":"MDEyOk9yZ2FuaXphdGlvbjcwMjQ1OQ==","avatar_url":"https://avatars2.githubusercontent.com/u/702459?v=4","gravatar_id":"","url":"https://api.github.com/users/signalapp","html_url":"https://github.com/signalapp","followers_url":"https://api.github.com/users/signalapp/followers","following_url":"https://api.github.com/users/signalapp/following{/other_user}","gists_url":"https://api.github.com/users/signalapp/gists{/gist_id}","starred_url":"https://api.github.com/users/signalapp/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/signalapp/subscriptions","organizations_url":"https://api.github.com/users/signalapp/orgs","repos_url":"https://api.github.com/users/signalapp/repos","events_url":"https://api.github.com/users/signalapp/events{/privacy}","received_events_url":"https://api.github.com/users/signalapp/received_events","type":"Organization","site_admin":false},"html_url":"https://github.com/signalapp/Signal-Android","description":"A private messenger for Android.","fork":false,"url":"https://api.github.com/repos/signalapp/Signal-Android","forks_url":"https://api.github.com/repos/signalapp/Signal-Android/forks","keys_url":"https://api.github.com/repos/signalapp/Signal-Android/keys{/key_id}","collaborators_url":"https://api.github.com/repos/signalapp/Signal-Android/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/signalapp/Signal-Android/teams","hooks_url":"https://api.github.com/repos/signalapp/Signal-Android/hooks","issue_events_url":"https://api.github.com/repos/signalapp/Signal-Android/issues/events{/number}","events_url":"https://api.github.com/repos/signalapp/Signal-Android/events","assignees_url":"https://api.github.com/repos/signalapp/Signal-Android/assignees{/user}","branches_url":"https://api.github.com/repos/signalapp/Signal-Android/branches{/branch}","tags_url":"https://api.github.com/repos/signalapp/Signal-Android/tags","blobs_url":"https://api.github.com/repos/signalapp/Signal-Android/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/signalapp/Signal-Android/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/signalapp/Signal-Android/git/refs{/sha}","trees_url":"https://api.github.com/repos/signalapp/Signal-Android/git/trees{/sha}","statuses_url":"https://api.github.com/repos/signalapp/Signal-Android/statuses/{sha}","languages_url":"https://api.github.com/repos/signalapp/Signal-Android/languages","stargazers_url":"https://api.github.com/repos/signalapp/Signal-Android/stargazers","contributors_url":"https://api.github.com/repos/signalapp/Signal-Android/contributors","subscribers_url":"https://api.github.com/repos/signalapp/Signal-Android/subscribers","subscription_url":"https://api.github.com/repos/signalapp/Signal-Android/subscription","commits_url":"https://api.github.com/repos/signalapp/Signal-Android/commits{/sha}","git_commits_url":"https://api.github.com/repos/signalapp/Signal-Android/git/commits{/sha}","comments_url":"https://api.github.com/repos/signalapp/Signal-Android/comments{/number}","issue_comment_url":"https://api.github.com/repos/signalapp/Signal-Android/issues/comments{/number}","contents_url":"https://api.github.com/repos/signalapp/Signal-Android/contents/{+path}","compare_url":"https://api.github.com/repos/signalapp/Signal-Android/compare/{base}...{head}","merges_url":"https://api.github.com/repos/signalapp/Signal-Android/merges","archive_url":"https://api.github.com/repos/signalapp/Signal-Android/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/signalapp/Signal-Android/downloads","issues_url":"https://api.github.com/repos/signalapp/Signal-Android/issues{/number}","pulls_url":"https://api.github.com/repos/signalapp/Signal-Android/pulls{/number}","milestones_url":"https://api.github.com/repos/signalapp/Signal-Android/milestones{/number}","notifications_url":"https://api.github.com/repos/signalapp/Signal-Android/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/signalapp/Signal-Android/labels{/name}","releases_url":"https://api.github.com/repos/signalapp/Signal-Android/releases{/id}","deployments_url":"https://api.github.com/repos/signalapp/Signal-Android/deployments","created_at":"2011-12-15T20:01:12Z","updated_at":"2019-09-01T05:11:42Z","pushed_at":"2019-09-01T06:54:12Z","git_url":"git://github.com/signalapp/Signal-Android.git","ssh_url":"git@github.com:signalapp/Signal-Android.git","clone_url":"https://github.com/signalapp/Signal-Android.git","svn_url":"https://github.com/signalapp/Signal-Android","homepage":"https://signal.org","size":201654,"stargazers_count":11802,"watchers_count":11802,"language":"Java","has_issues":true,"has_projects":true,"has_downloads":true,"has_wiki":true,"has_pages":false,"forks_count":3025,"mirror_url":null,"archived":false,"disabled":false,"open_issues_count":450,"license":{"key":"gpl-3.0","name":"GNU General Public License v3.0","spdx_id":"GPL-3.0","url":"https://api.github.com/licenses/gpl-3.0","node_id":"MDc6TGljZW5zZTk="},"forks":3025,"open_issues":450,"watchers":11802,"default_branch":"master","score":68.65655},{"id":2626751,"node_id":"MDEwOlJlcG9zaXRvcnkyNjI2NzUx","name":"greenDAO","full_name":"greenrobot/greenDAO","private":false,"owner":{"login":"greenrobot","id":242242,"node_id":"MDQ6VXNlcjI0MjI0Mg==","avatar_url":"https://avatars0.githubusercontent.com/u/242242?v=4","gravatar_id":"","url":"https://api.github.com/users/greenrobot","html_url":"https://github.com/greenrobot","followers_url":"https://api.github.com/users/greenrobot/followers","following_url":"https://api.github.com/users/greenrobot/following{/other_user}","gists_url":"https://api.github.com/users/greenrobot/gists{/gist_id}","starred_url":"https://api.github.com/users/greenrobot/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/greenrobot/subscriptions","organizations_url":"https://api.github.com/users/greenrobot/orgs","repos_url":"https://api.github.com/users/greenrobot/repos","events_url":"https://api.github.com/users/greenrobot/events{/privacy}","received_events_url":"https://api.github.com/users/greenrobot/received_events","type":"User","site_admin":false},"html_url":"https://github.com/greenrobot/greenDAO","description":"greenDAO is a light & fast ORM solution for Android that maps objects to SQLite databases.","fork":false,"url":"https://api.github.com/repos/greenrobot/greenDAO","forks_url":"https://api.github.com/repos/greenrobot/greenDAO/forks","keys_url":"https://api.github.com/repos/greenrobot/greenDAO/keys{/key_id}","collaborators_url":"https://api.github.com/repos/greenrobot/greenDAO/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/greenrobot/greenDAO/teams","hooks_url":"https://api.github.com/repos/greenrobot/greenDAO/hooks","issue_events_url":"https://api.github.com/repos/greenrobot/greenDAO/issues/events{/number}","events_url":"https://api.github.com/repos/greenrobot/greenDAO/events","assignees_url":"https://api.github.com/repos/greenrobot/greenDAO/assignees{/user}","branches_url":"https://api.github.com/repos/greenrobot/greenDAO/branches{/branch}","tags_url":"https://api.github.com/repos/greenrobot/greenDAO/tags","blobs_url":"https://api.github.com/repos/greenrobot/greenDAO/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/greenrobot/greenDAO/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/greenrobot/greenDAO/git/refs{/sha}","trees_url":"https://api.github.com/repos/greenrobot/greenDAO/git/trees{/sha}","statuses_url":"https://api.github.com/repos/greenrobot/greenDAO/statuses/{sha}","languages_url":"https://api.github.com/repos/greenrobot/greenDAO/languages","stargazers_url":"https://api.github.com/repos/greenrobot/greenDAO/stargazers","contributors_url":"https://api.github.com/repos/greenrobot/greenDAO/contributors","subscribers_url":"https://api.github.com/repos/greenrobot/greenDAO/subscribers","subscription_url":"https://api.github.com/repos/greenrobot/greenDAO/subscription","commits_url":"https://api.github.com/repos/greenrobot/greenDAO/commits{/sha}","git_commits_url":"https://api.github.com/repos/greenrobot/greenDAO/git/commits{/sha}","comments_url":"https://api.github.com/repos/greenrobot/greenDAO/comments{/number}","issue_comment_url":"https://api.github.com/repos/greenrobot/greenDAO/issues/comments{/number}","contents_url":"https://api.github.com/repos/greenrobot/greenDAO/contents/{+path}","compare_url":"https://api.github.com/repos/greenrobot/greenDAO/compare/{base}...{head}","merges_url":"https://api.github.com/repos/greenrobot/greenDAO/merges","archive_url":"https://api.github.com/repos/greenrobot/greenDAO/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/greenrobot/greenDAO/downloads","issues_url":"https://api.github.com/repos/greenrobot/greenDAO/issues{/number}","pulls_url":"https://api.github.com/repos/greenrobot/greenDAO/pulls{/number}","milestones_url":"https://api.github.com/repos/greenrobot/greenDAO/milestones{/number}","notifications_url":"https://api.github.com/repos/greenrobot/greenDAO/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/greenrobot/greenDAO/labels{/name}","releases_url":"https://api.github.com/repos/greenrobot/greenDAO/releases{/id}","deployments_url":"https://api.github.com/repos/greenrobot/greenDAO/deployments","created_at":"2011-10-22T16:15:14Z","updated_at":"2019-08-31T14:20:15Z","pushed_at":"2019-07-16T13:31:34Z","git_url":"git://github.com/greenrobot/greenDAO.git","ssh_url":"git@github.com:greenrobot/greenDAO.git","clone_url":"https://github.com/greenrobot/greenDAO.git","svn_url":"https://github.com/greenrobot/greenDAO","homepage":"http://greenrobot.org/greendao/","size":7220,"stargazers_count":11596,"watchers_count":11596,"language":"Java","has_issues":true,"has_projects":true,"has_downloads":true,"has_wiki":false,"has_pages":false,"forks_count":2771,"mirror_url":null,"archived":false,"disabled":false,"open_issues_count":175,"license":null,"forks":2771,"open_issues":175,"watchers":11596,"default_branch":"master","score":38.548824},{"id":32610336,"node_id":"MDEwOlJlcG9zaXRvcnkzMjYxMDMzNg==","name":"logger","full_name":"orhanobut/logger","private":false,"owner":{"login":"orhanobut","id":1089616,"node_id":"MDQ6VXNlcjEwODk2MTY=","avatar_url":"https://avatars3.githubusercontent.com/u/1089616?v=4","gravatar_id":"","url":"https://api.github.com/users/orhanobut","html_url":"https://github.com/orhanobut","followers_url":"https://api.github.com/users/orhanobut/followers","following_url":"https://api.github.com/users/orhanobut/following{/other_user}","gists_url":"https://api.github.com/users/orhanobut/gists{/gist_id}","starred_url":"https://api.github.com/users/orhanobut/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/orhanobut/subscriptions","organizations_url":"https://api.github.com/users/orhanobut/orgs","repos_url":"https://api.github.com/users/orhanobut/repos","events_url":"https://api.github.com/users/orhanobut/events{/privacy}","received_events_url":"https://api.github.com/users/orhanobut/received_events","type":"User","site_admin":false},"html_url":"https://github.com/orhanobut/logger","description":"✔️ Simple, pretty and powerful logger for android","fork":false,"url":"https://api.github.com/repos/orhanobut/logger","forks_url":"https://api.github.com/repos/orhanobut/logger/forks","keys_url":"https://api.github.com/repos/orhanobut/logger/keys{/key_id}","collaborators_url":"https://api.github.com/repos/orhanobut/logger/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/orhanobut/logger/teams","hooks_url":"https://api.github.com/repos/orhanobut/logger/hooks","issue_events_url":"https://api.github.com/repos/orhanobut/logger/issues/events{/number}","events_url":"https://api.github.com/repos/orhanobut/logger/events","assignees_url":"https://api.github.com/repos/orhanobut/logger/assignees{/user}","branches_url":"https://api.github.com/repos/orhanobut/logger/branches{/branch}","tags_url":"https://api.github.com/repos/orhanobut/logger/tags","blobs_url":"https://api.github.com/repos/orhanobut/logger/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/orhanobut/logger/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/orhanobut/logger/git/refs{/sha}","trees_url":"https://api.github.com/repos/orhanobut/logger/git/trees{/sha}","statuses_url":"https://api.github.com/repos/orhanobut/logger/statuses/{sha}","languages_url":"https://api.github.com/repos/orhanobut/logger/languages","stargazers_url":"https://api.github.com/repos/orhanobut/logger/stargazers","contributors_url":"https://api.github.com/repos/orhanobut/logger/contributors","subscribers_url":"https://api.github.com/repos/orhanobut/logger/subscribers","subscription_url":"https://api.github.com/repos/orhanobut/logger/subscription","commits_url":"https://api.github.com/repos/orhanobut/logger/commits{/sha}","git_commits_url":"https://api.github.com/repos/orhanobut/logger/git/commits{/sha}","comments_url":"https://api.github.com/repos/orhanobut/logger/comments{/number}","issue_comment_url":"https://api.github.com/repos/orhanobut/logger/issues/comments{/number}","contents_url":"https://api.github.com/repos/orhanobut/logger/contents/{+path}","compare_url":"https://api.github.com/repos/orhanobut/logger/compare/{base}...{head}","merges_url":"https://api.github.com/repos/orhanobut/logger/merges","archive_url":"https://api.github.com/repos/orhanobut/logger/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/orhanobut/logger/downloads","issues_url":"https://api.github.com/repos/orhanobut/logger/issues{/number}","pulls_url":"https://api.github.com/repos/orhanobut/logger/pulls{/number}","milestones_url":"https://api.github.com/repos/orhanobut/logger/milestones{/number}","notifications_url":"https://api.github.com/repos/orhanobut/logger/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/orhanobut/logger/labels{/name}","releases_url":"https://api.github.com/repos/orhanobut/logger/releases{/id}","deployments_url":"https://api.github.com/repos/orhanobut/logger/deployments","created_at":"2015-03-20T22:30:12Z","updated_at":"2019-09-01T02:22:45Z","pushed_at":"2019-08-23T05:49:38Z","git_url":"git://github.com/orhanobut/logger.git","ssh_url":"git@github.com:orhanobut/logger.git","clone_url":"https://github.com/orhanobut/logger.git","svn_url":"https://github.com/orhanobut/logger","homepage":"","size":1875,"stargazers_count":11587,"watchers_count":11587,"language":"Java","has_issues":true,"has_projects":false,"has_downloads":true,"has_wiki":false,"has_pages":false,"forks_count":1839,"mirror_url":null,"archived":false,"disabled":false,"open_issues_count":53,"license":{"key":"apache-2.0","name":"Apache License 2.0","spdx_id":"Apache-2.0","url":"https://api.github.com/licenses/apache-2.0","node_id":"MDc6TGljZW5zZTI="},"forks":1839,"open_issues":53,"watchers":11587,"default_branch":"master","score":51.911865},{"id":23301468,"node_id":"MDEwOlJlcG9zaXRvcnkyMzMwMTQ2OA==","name":"AndroidSwipeLayout","full_name":"daimajia/AndroidSwipeLayout","private":false,"owner":{"login":"daimajia","id":2503423,"node_id":"MDQ6VXNlcjI1MDM0MjM=","avatar_url":"https://avatars1.githubusercontent.com/u/2503423?v=4","gravatar_id":"","url":"https://api.github.com/users/daimajia","html_url":"https://github.com/daimajia","followers_url":"https://api.github.com/users/daimajia/followers","following_url":"https://api.github.com/users/daimajia/following{/other_user}","gists_url":"https://api.github.com/users/daimajia/gists{/gist_id}","starred_url":"https://api.github.com/users/daimajia/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/daimajia/subscriptions","organizations_url":"https://api.github.com/users/daimajia/orgs","repos_url":"https://api.github.com/users/daimajia/repos","events_url":"https://api.github.com/users/daimajia/events{/privacy}","received_events_url":"https://api.github.com/users/daimajia/received_events","type":"User","site_admin":false},"html_url":"https://github.com/daimajia/AndroidSwipeLayout","description":"The Most Powerful Swipe Layout!","fork":false,"url":"https://api.github.com/repos/daimajia/AndroidSwipeLayout","forks_url":"https://api.github.com/repos/daimajia/AndroidSwipeLayout/forks","keys_url":"https://api.github.com/repos/daimajia/AndroidSwipeLayout/keys{/key_id}","collaborators_url":"https://api.github.com/repos/daimajia/AndroidSwipeLayout/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/daimajia/AndroidSwipeLayout/teams","hooks_url":"https://api.github.com/repos/daimajia/AndroidSwipeLayout/hooks","issue_events_url":"https://api.github.com/repos/daimajia/AndroidSwipeLayout/issues/events{/number}","events_url":"https://api.github.com/repos/daimajia/AndroidSwipeLayout/events","assignees_url":"https://api.github.com/repos/daimajia/AndroidSwipeLayout/assignees{/user}","branches_url":"https://api.github.com/repos/daimajia/AndroidSwipeLayout/branches{/branch}","tags_url":"https://api.github.com/repos/daimajia/AndroidSwipeLayout/tags","blobs_url":"https://api.github.com/repos/daimajia/AndroidSwipeLayout/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/daimajia/AndroidSwipeLayout/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/daimajia/AndroidSwipeLayout/git/refs{/sha}","trees_url":"https://api.github.com/repos/daimajia/AndroidSwipeLayout/git/trees{/sha}","statuses_url":"https://api.github.com/repos/daimajia/AndroidSwipeLayout/statuses/{sha}","languages_url":"https://api.github.com/repos/daimajia/AndroidSwipeLayout/languages","stargazers_url":"https://api.github.com/repos/daimajia/AndroidSwipeLayout/stargazers","contributors_url":"https://api.github.com/repos/daimajia/AndroidSwipeLayout/contributors","subscribers_url":"https://api.github.com/repos/daimajia/AndroidSwipeLayout/subscribers","subscription_url":"https://api.github.com/repos/daimajia/AndroidSwipeLayout/subscription","commits_url":"https://api.github.com/repos/daimajia/AndroidSwipeLayout/commits{/sha}","git_commits_url":"https://api.github.com/repos/daimajia/AndroidSwipeLayout/git/commits{/sha}","comments_url":"https://api.github.com/repos/daimajia/AndroidSwipeLayout/comments{/number}","issue_comment_url":"https://api.github.com/repos/daimajia/AndroidSwipeLayout/issues/comments{/number}","contents_url":"https://api.github.com/repos/daimajia/AndroidSwipeLayout/contents/{+path}","compare_url":"https://api.github.com/repos/daimajia/AndroidSwipeLayout/compare/{base}...{head}","merges_url":"https://api.github.com/repos/daimajia/AndroidSwipeLayout/merges","archive_url":"https://api.github.com/repos/daimajia/AndroidSwipeLayout/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/daimajia/AndroidSwipeLayout/downloads","issues_url":"https://api.github.com/repos/daimajia/AndroidSwipeLayout/issues{/number}","pulls_url":"https://api.github.com/repos/daimajia/AndroidSwipeLayout/pulls{/number}","milestones_url":"https://api.github.com/repos/daimajia/AndroidSwipeLayout/milestones{/number}","notifications_url":"https://api.github.com/repos/daimajia/AndroidSwipeLayout/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/daimajia/AndroidSwipeLayout/labels{/name}","releases_url":"https://api.github.com/repos/daimajia/AndroidSwipeLayout/releases{/id}","deployments_url":"https://api.github.com/repos/daimajia/AndroidSwipeLayout/deployments","created_at":"2014-08-25T04:09:33Z","updated_at":"2019-08-31T11:13:58Z","pushed_at":"2019-07-22T12:18:10Z","git_url":"git://github.com/daimajia/AndroidSwipeLayout.git","ssh_url":"git@github.com:daimajia/AndroidSwipeLayout.git","clone_url":"https://github.com/daimajia/AndroidSwipeLayout.git","svn_url":"https://github.com/daimajia/AndroidSwipeLayout","homepage":"","size":399,"stargazers_count":11417,"watchers_count":11417,"language":"Java","has_issues":true,"has_projects":true,"has_downloads":true,"has_wiki":true,"has_pages":false,"forks_count":2653,"mirror_url":null,"archived":false,"disabled":false,"open_issues_count":354,"license":{"key":"mit","name":"MIT License","spdx_id":"MIT","url":"https://api.github.com/licenses/mit","node_id":"MDc6TGljZW5zZTEz"},"forks":2653,"open_issues":354,"watchers":11417,"default_branch":"master","score":77.59384},{"id":29703871,"node_id":"MDEwOlJlcG9zaXRvcnkyOTcwMzg3MQ==","name":"stetho","full_name":"facebook/stetho","private":false,"owner":{"login":"facebook","id":69631,"node_id":"MDEyOk9yZ2FuaXphdGlvbjY5NjMx","avatar_url":"https://avatars3.githubusercontent.com/u/69631?v=4","gravatar_id":"","url":"https://api.github.com/users/facebook","html_url":"https://github.com/facebook","followers_url":"https://api.github.com/users/facebook/followers","following_url":"https://api.github.com/users/facebook/following{/other_user}","gists_url":"https://api.github.com/users/facebook/gists{/gist_id}","starred_url":"https://api.github.com/users/facebook/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/facebook/subscriptions","organizations_url":"https://api.github.com/users/facebook/orgs","repos_url":"https://api.github.com/users/facebook/repos","events_url":"https://api.github.com/users/facebook/events{/privacy}","received_events_url":"https://api.github.com/users/facebook/received_events","type":"Organization","site_admin":false},"html_url":"https://github.com/facebook/stetho","description":"Stetho is a debug bridge for Android applications, enabling the powerful Chrome Developer Tools and much more.","fork":false,"url":"https://api.github.com/repos/facebook/stetho","forks_url":"https://api.github.com/repos/facebook/stetho/forks","keys_url":"https://api.github.com/repos/facebook/stetho/keys{/key_id}","collaborators_url":"https://api.github.com/repos/facebook/stetho/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/facebook/stetho/teams","hooks_url":"https://api.github.com/repos/facebook/stetho/hooks","issue_events_url":"https://api.github.com/repos/facebook/stetho/issues/events{/number}","events_url":"https://api.github.com/repos/facebook/stetho/events","assignees_url":"https://api.github.com/repos/facebook/stetho/assignees{/user}","branches_url":"https://api.github.com/repos/facebook/stetho/branches{/branch}","tags_url":"https://api.github.com/repos/facebook/stetho/tags","blobs_url":"https://api.github.com/repos/facebook/stetho/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/facebook/stetho/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/facebook/stetho/git/refs{/sha}","trees_url":"https://api.github.com/repos/facebook/stetho/git/trees{/sha}","statuses_url":"https://api.github.com/repos/facebook/stetho/statuses/{sha}","languages_url":"https://api.github.com/repos/facebook/stetho/languages","stargazers_url":"https://api.github.com/repos/facebook/stetho/stargazers","contributors_url":"https://api.github.com/repos/facebook/stetho/contributors","subscribers_url":"https://api.github.com/repos/facebook/stetho/subscribers","subscription_url":"https://api.github.com/repos/facebook/stetho/subscription","commits_url":"https://api.github.com/repos/facebook/stetho/commits{/sha}","git_commits_url":"https://api.github.com/repos/facebook/stetho/git/commits{/sha}","comments_url":"https://api.github.com/repos/facebook/stetho/comments{/number}","issue_comment_url":"https://api.github.com/repos/facebook/stetho/issues/comments{/number}","contents_url":"https://api.github.com/repos/facebook/stetho/contents/{+path}","compare_url":"https://api.github.com/repos/facebook/stetho/compare/{base}...{head}","merges_url":"https://api.github.com/repos/facebook/stetho/merges","archive_url":"https://api.github.com/repos/facebook/stetho/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/facebook/stetho/downloads","issues_url":"https://api.github.com/repos/facebook/stetho/issues{/number}","pulls_url":"https://api.github.com/repos/facebook/stetho/pulls{/number}","milestones_url":"https://api.github.com/repos/facebook/stetho/milestones{/number}","notifications_url":"https://api.github.com/repos/facebook/stetho/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/facebook/stetho/labels{/name}","releases_url":"https://api.github.com/repos/facebook/stetho/releases{/id}","deployments_url":"https://api.github.com/repos/facebook/stetho/deployments","created_at":"2015-01-22T22:34:10Z","updated_at":"2019-09-01T05:58:18Z","pushed_at":"2019-08-22T08:33:36Z","git_url":"git://github.com/facebook/stetho.git","ssh_url":"git@github.com:facebook/stetho.git","clone_url":"https://github.com/facebook/stetho.git","svn_url":"https://github.com/facebook/stetho","homepage":"http://facebook.github.io/stetho/","size":2269,"stargazers_count":11405,"watchers_count":11405,"language":"Java","has_issues":true,"has_projects":true,"has_downloads":true,"has_wiki":true,"has_pages":true,"forks_count":1045,"mirror_url":null,"archived":false,"disabled":false,"open_issues_count":51,"license":{"key":"other","name":"Other","spdx_id":"NOASSERTION","url":null,"node_id":"MDc6TGljZW5zZTA="},"forks":1045,"open_issues":51,"watchers":11405,"default_branch":"master","score":30.706318},{"id":4839957,"node_id":"MDEwOlJlcG9zaXRvcnk0ODM5OTU3","name":"SlidingMenu","full_name":"jfeinstein10/SlidingMenu","private":false,"owner":{"login":"jfeinstein10","id":1269143,"node_id":"MDQ6VXNlcjEyNjkxNDM=","avatar_url":"https://avatars1.githubusercontent.com/u/1269143?v=4","gravatar_id":"","url":"https://api.github.com/users/jfeinstein10","html_url":"https://github.com/jfeinstein10","followers_url":"https://api.github.com/users/jfeinstein10/followers","following_url":"https://api.github.com/users/jfeinstein10/following{/other_user}","gists_url":"https://api.github.com/users/jfeinstein10/gists{/gist_id}","starred_url":"https://api.github.com/users/jfeinstein10/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/jfeinstein10/subscriptions","organizations_url":"https://api.github.com/users/jfeinstein10/orgs","repos_url":"https://api.github.com/users/jfeinstein10/repos","events_url":"https://api.github.com/users/jfeinstein10/events{/privacy}","received_events_url":"https://api.github.com/users/jfeinstein10/received_events","type":"User","site_admin":false},"html_url":"https://github.com/jfeinstein10/SlidingMenu","description":"An Android library that allows you to easily create applications with slide-in menus. You may use it in your Android apps provided that you cite this project and include the license in your app. Thanks!","fork":false,"url":"https://api.github.com/repos/jfeinstein10/SlidingMenu","forks_url":"https://api.github.com/repos/jfeinstein10/SlidingMenu/forks","keys_url":"https://api.github.com/repos/jfeinstein10/SlidingMenu/keys{/key_id}","collaborators_url":"https://api.github.com/repos/jfeinstein10/SlidingMenu/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/jfeinstein10/SlidingMenu/teams","hooks_url":"https://api.github.com/repos/jfeinstein10/SlidingMenu/hooks","issue_events_url":"https://api.github.com/repos/jfeinstein10/SlidingMenu/issues/events{/number}","events_url":"https://api.github.com/repos/jfeinstein10/SlidingMenu/events","assignees_url":"https://api.github.com/repos/jfeinstein10/SlidingMenu/assignees{/user}","branches_url":"https://api.github.com/repos/jfeinstein10/SlidingMenu/branches{/branch}","tags_url":"https://api.github.com/repos/jfeinstein10/SlidingMenu/tags","blobs_url":"https://api.github.com/repos/jfeinstein10/SlidingMenu/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/jfeinstein10/SlidingMenu/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/jfeinstein10/SlidingMenu/git/refs{/sha}","trees_url":"https://api.github.com/repos/jfeinstein10/SlidingMenu/git/trees{/sha}","statuses_url":"https://api.github.com/repos/jfeinstein10/SlidingMenu/statuses/{sha}","languages_url":"https://api.github.com/repos/jfeinstein10/SlidingMenu/languages","stargazers_url":"https://api.github.com/repos/jfeinstein10/SlidingMenu/stargazers","contributors_url":"https://api.github.com/repos/jfeinstein10/SlidingMenu/contributors","subscribers_url":"https://api.github.com/repos/jfeinstein10/SlidingMenu/subscribers","subscription_url":"https://api.github.com/repos/jfeinstein10/SlidingMenu/subscription","commits_url":"https://api.github.com/repos/jfeinstein10/SlidingMenu/commits{/sha}","git_commits_url":"https://api.github.com/repos/jfeinstein10/SlidingMenu/git/commits{/sha}","comments_url":"https://api.github.com/repos/jfeinstein10/SlidingMenu/comments{/number}","issue_comment_url":"https://api.github.com/repos/jfeinstein10/SlidingMenu/issues/comments{/number}","contents_url":"https://api.github.com/repos/jfeinstein10/SlidingMenu/contents/{+path}","compare_url":"https://api.github.com/repos/jfeinstein10/SlidingMenu/compare/{base}...{head}","merges_url":"https://api.github.com/repos/jfeinstein10/SlidingMenu/merges","archive_url":"https://api.github.com/repos/jfeinstein10/SlidingMenu/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/jfeinstein10/SlidingMenu/downloads","issues_url":"https://api.github.com/repos/jfeinstein10/SlidingMenu/issues{/number}","pulls_url":"https://api.github.com/repos/jfeinstein10/SlidingMenu/pulls{/number}","milestones_url":"https://api.github.com/repos/jfeinstein10/SlidingMenu/milestones{/number}","notifications_url":"https://api.github.com/repos/jfeinstein10/SlidingMenu/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/jfeinstein10/SlidingMenu/labels{/name}","releases_url":"https://api.github.com/repos/jfeinstein10/SlidingMenu/releases{/id}","deployments_url":"https://api.github.com/repos/jfeinstein10/SlidingMenu/deployments","created_at":"2012-06-30T05:14:23Z","updated_at":"2019-08-27T17:35:49Z","pushed_at":"2017-03-31T02:15:51Z","git_url":"git://github.com/jfeinstein10/SlidingMenu.git","ssh_url":"git@github.com:jfeinstein10/SlidingMenu.git","clone_url":"https://github.com/jfeinstein10/SlidingMenu.git","svn_url":"https://github.com/jfeinstein10/SlidingMenu","homepage":"","size":32085,"stargazers_count":11190,"watchers_count":11190,"language":"Java","has_issues":true,"has_projects":true,"has_downloads":true,"has_wiki":true,"has_pages":true,"forks_count":5339,"mirror_url":null,"archived":false,"disabled":false,"open_issues_count":307,"license":{"key":"apache-2.0","name":"Apache License 2.0","spdx_id":"Apache-2.0","url":"https://api.github.com/licenses/apache-2.0","node_id":"MDc6TGljZW5zZTI="},"forks":5339,"open_issues":307,"watchers":11190,"default_branch":"master","score":37.335693},{"id":3116751,"node_id":"MDEwOlJlcG9zaXRvcnkzMTE2NzUx","name":"androidannotations","full_name":"androidannotations/androidannotations","private":false,"owner":{"login":"androidannotations","id":1315313,"node_id":"MDEyOk9yZ2FuaXphdGlvbjEzMTUzMTM=","avatar_url":"https://avatars3.githubusercontent.com/u/1315313?v=4","gravatar_id":"","url":"https://api.github.com/users/androidannotations","html_url":"https://github.com/androidannotations","followers_url":"https://api.github.com/users/androidannotations/followers","following_url":"https://api.github.com/users/androidannotations/following{/other_user}","gists_url":"https://api.github.com/users/androidannotations/gists{/gist_id}","starred_url":"https://api.github.com/users/androidannotations/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/androidannotations/subscriptions","organizations_url":"https://api.github.com/users/androidannotations/orgs","repos_url":"https://api.github.com/users/androidannotations/repos","events_url":"https://api.github.com/users/androidannotations/events{/privacy}","received_events_url":"https://api.github.com/users/androidannotations/received_events","type":"Organization","site_admin":false},"html_url":"https://github.com/androidannotations/androidannotations","description":"Fast Android Development. Easy maintainance.","fork":false,"url":"https://api.github.com/repos/androidannotations/androidannotations","forks_url":"https://api.github.com/repos/androidannotations/androidannotations/forks","keys_url":"https://api.github.com/repos/androidannotations/androidannotations/keys{/key_id}","collaborators_url":"https://api.github.com/repos/androidannotations/androidannotations/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/androidannotations/androidannotations/teams","hooks_url":"https://api.github.com/repos/androidannotations/androidannotations/hooks","issue_events_url":"https://api.github.com/repos/androidannotations/androidannotations/issues/events{/number}","events_url":"https://api.github.com/repos/androidannotations/androidannotations/events","assignees_url":"https://api.github.com/repos/androidannotations/androidannotations/assignees{/user}","branches_url":"https://api.github.com/repos/androidannotations/androidannotations/branches{/branch}","tags_url":"https://api.github.com/repos/androidannotations/androidannotations/tags","blobs_url":"https://api.github.com/repos/androidannotations/androidannotations/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/androidannotations/androidannotations/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/androidannotations/androidannotations/git/refs{/sha}","trees_url":"https://api.github.com/repos/androidannotations/androidannotations/git/trees{/sha}","statuses_url":"https://api.github.com/repos/androidannotations/androidannotations/statuses/{sha}","languages_url":"https://api.github.com/repos/androidannotations/androidannotations/languages","stargazers_url":"https://api.github.com/repos/androidannotations/androidannotations/stargazers","contributors_url":"https://api.github.com/repos/androidannotations/androidannotations/contributors","subscribers_url":"https://api.github.com/repos/androidannotations/androidannotations/subscribers","subscription_url":"https://api.github.com/repos/androidannotations/androidannotations/subscription","commits_url":"https://api.github.com/repos/androidannotations/androidannotations/commits{/sha}","git_commits_url":"https://api.github.com/repos/androidannotations/androidannotations/git/commits{/sha}","comments_url":"https://api.github.com/repos/androidannotations/androidannotations/comments{/number}","issue_comment_url":"https://api.github.com/repos/androidannotations/androidannotations/issues/comments{/number}","contents_url":"https://api.github.com/repos/androidannotations/androidannotations/contents/{+path}","compare_url":"https://api.github.com/repos/androidannotations/androidannotations/compare/{base}...{head}","merges_url":"https://api.github.com/repos/androidannotations/androidannotations/merges","archive_url":"https://api.github.com/repos/androidannotations/androidannotations/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/androidannotations/androidannotations/downloads","issues_url":"https://api.github.com/repos/androidannotations/androidannotations/issues{/number}","pulls_url":"https://api.github.com/repos/androidannotations/androidannotations/pulls{/number}","milestones_url":"https://api.github.com/repos/androidannotations/androidannotations/milestones{/number}","notifications_url":"https://api.github.com/repos/androidannotations/androidannotations/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/androidannotations/androidannotations/labels{/name}","releases_url":"https://api.github.com/repos/androidannotations/androidannotations/releases{/id}","deployments_url":"https://api.github.com/repos/androidannotations/androidannotations/deployments","created_at":"2012-01-06T08:48:03Z","updated_at":"2019-09-01T07:40:54Z","pushed_at":"2019-09-01T07:40:51Z","git_url":"git://github.com/androidannotations/androidannotations.git","ssh_url":"git@github.com:androidannotations/androidannotations.git","clone_url":"https://github.com/androidannotations/androidannotations.git","svn_url":"https://github.com/androidannotations/androidannotations","homepage":"http://androidannotations.org","size":22299,"stargazers_count":10872,"watchers_count":10872,"language":"Java","has_issues":true,"has_projects":false,"has_downloads":true,"has_wiki":true,"has_pages":false,"forks_count":2451,"mirror_url":null,"archived":false,"disabled":false,"open_issues_count":51,"license":{"key":"other","name":"Other","spdx_id":"NOASSERTION","url":null,"node_id":"MDc6TGljZW5zZTA="},"forks":2451,"open_issues":51,"watchers":10872,"default_branch":"develop","score":71.773224},{"id":21113349,"node_id":"MDEwOlJlcG9zaXRvcnkyMTExMzM0OQ==","name":"AndroidViewAnimations","full_name":"daimajia/AndroidViewAnimations","private":false,"owner":{"login":"daimajia","id":2503423,"node_id":"MDQ6VXNlcjI1MDM0MjM=","avatar_url":"https://avatars1.githubusercontent.com/u/2503423?v=4","gravatar_id":"","url":"https://api.github.com/users/daimajia","html_url":"https://github.com/daimajia","followers_url":"https://api.github.com/users/daimajia/followers","following_url":"https://api.github.com/users/daimajia/following{/other_user}","gists_url":"https://api.github.com/users/daimajia/gists{/gist_id}","starred_url":"https://api.github.com/users/daimajia/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/daimajia/subscriptions","organizations_url":"https://api.github.com/users/daimajia/orgs","repos_url":"https://api.github.com/users/daimajia/repos","events_url":"https://api.github.com/users/daimajia/events{/privacy}","received_events_url":"https://api.github.com/users/daimajia/received_events","type":"User","site_admin":false},"html_url":"https://github.com/daimajia/AndroidViewAnimations","description":"Cute view animation collection.","fork":false,"url":"https://api.github.com/repos/daimajia/AndroidViewAnimations","forks_url":"https://api.github.com/repos/daimajia/AndroidViewAnimations/forks","keys_url":"https://api.github.com/repos/daimajia/AndroidViewAnimations/keys{/key_id}","collaborators_url":"https://api.github.com/repos/daimajia/AndroidViewAnimations/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/daimajia/AndroidViewAnimations/teams","hooks_url":"https://api.github.com/repos/daimajia/AndroidViewAnimations/hooks","issue_events_url":"https://api.github.com/repos/daimajia/AndroidViewAnimations/issues/events{/number}","events_url":"https://api.github.com/repos/daimajia/AndroidViewAnimations/events","assignees_url":"https://api.github.com/repos/daimajia/AndroidViewAnimations/assignees{/user}","branches_url":"https://api.github.com/repos/daimajia/AndroidViewAnimations/branches{/branch}","tags_url":"https://api.github.com/repos/daimajia/AndroidViewAnimations/tags","blobs_url":"https://api.github.com/repos/daimajia/AndroidViewAnimations/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/daimajia/AndroidViewAnimations/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/daimajia/AndroidViewAnimations/git/refs{/sha}","trees_url":"https://api.github.com/repos/daimajia/AndroidViewAnimations/git/trees{/sha}","statuses_url":"https://api.github.com/repos/daimajia/AndroidViewAnimations/statuses/{sha}","languages_url":"https://api.github.com/repos/daimajia/AndroidViewAnimations/languages","stargazers_url":"https://api.github.com/repos/daimajia/AndroidViewAnimations/stargazers","contributors_url":"https://api.github.com/repos/daimajia/AndroidViewAnimations/contributors","subscribers_url":"https://api.github.com/repos/daimajia/AndroidViewAnimations/subscribers","subscription_url":"https://api.github.com/repos/daimajia/AndroidViewAnimations/subscription","commits_url":"https://api.github.com/repos/daimajia/AndroidViewAnimations/commits{/sha}","git_commits_url":"https://api.github.com/repos/daimajia/AndroidViewAnimations/git/commits{/sha}","comments_url":"https://api.github.com/repos/daimajia/AndroidViewAnimations/comments{/number}","issue_comment_url":"https://api.github.com/repos/daimajia/AndroidViewAnimations/issues/comments{/number}","contents_url":"https://api.github.com/repos/daimajia/AndroidViewAnimations/contents/{+path}","compare_url":"https://api.github.com/repos/daimajia/AndroidViewAnimations/compare/{base}...{head}","merges_url":"https://api.github.com/repos/daimajia/AndroidViewAnimations/merges","archive_url":"https://api.github.com/repos/daimajia/AndroidViewAnimations/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/daimajia/AndroidViewAnimations/downloads","issues_url":"https://api.github.com/repos/daimajia/AndroidViewAnimations/issues{/number}","pulls_url":"https://api.github.com/repos/daimajia/AndroidViewAnimations/pulls{/number}","milestones_url":"https://api.github.com/repos/daimajia/AndroidViewAnimations/milestones{/number}","notifications_url":"https://api.github.com/repos/daimajia/AndroidViewAnimations/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/daimajia/AndroidViewAnimations/labels{/name}","releases_url":"https://api.github.com/repos/daimajia/AndroidViewAnimations/releases{/id}","deployments_url":"https://api.github.com/repos/daimajia/AndroidViewAnimations/deployments","created_at":"2014-06-23T03:53:13Z","updated_at":"2019-09-01T00:57:04Z","pushed_at":"2019-05-31T18:15:45Z","git_url":"git://github.com/daimajia/AndroidViewAnimations.git","ssh_url":"git@github.com:daimajia/AndroidViewAnimations.git","clone_url":"https://github.com/daimajia/AndroidViewAnimations.git","svn_url":"https://github.com/daimajia/AndroidViewAnimations","homepage":"","size":291,"stargazers_count":10813,"watchers_count":10813,"language":"Java","has_issues":true,"has_projects":true,"has_downloads":true,"has_wiki":true,"has_pages":false,"forks_count":2268,"mirror_url":null,"archived":false,"disabled":false,"open_issues_count":52,"license":{"key":"mit","name":"MIT License","spdx_id":"MIT","url":"https://api.github.com/licenses/mit","node_id":"MDc6TGljZW5zZTEz"},"forks":2268,"open_issues":52,"watchers":10813,"default_branch":"master","score":76.422264},{"id":76413186,"node_id":"MDEwOlJlcG9zaXRvcnk3NjQxMzE4Ng==","name":"ARouter","full_name":"alibaba/ARouter","private":false,"owner":{"login":"alibaba","id":1961952,"node_id":"MDEyOk9yZ2FuaXphdGlvbjE5NjE5NTI=","avatar_url":"https://avatars1.githubusercontent.com/u/1961952?v=4","gravatar_id":"","url":"https://api.github.com/users/alibaba","html_url":"https://github.com/alibaba","followers_url":"https://api.github.com/users/alibaba/followers","following_url":"https://api.github.com/users/alibaba/following{/other_user}","gists_url":"https://api.github.com/users/alibaba/gists{/gist_id}","starred_url":"https://api.github.com/users/alibaba/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/alibaba/subscriptions","organizations_url":"https://api.github.com/users/alibaba/orgs","repos_url":"https://api.github.com/users/alibaba/repos","events_url":"https://api.github.com/users/alibaba/events{/privacy}","received_events_url":"https://api.github.com/users/alibaba/received_events","type":"Organization","site_admin":false},"html_url":"https://github.com/alibaba/ARouter","description":"💪 A framework for assisting in the renovation of Android componentization (帮助 Android App 进行组件化改造的路由框架)","fork":false,"url":"https://api.github.com/repos/alibaba/ARouter","forks_url":"https://api.github.com/repos/alibaba/ARouter/forks","keys_url":"https://api.github.com/repos/alibaba/ARouter/keys{/key_id}","collaborators_url":"https://api.github.com/repos/alibaba/ARouter/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/alibaba/ARouter/teams","hooks_url":"https://api.github.com/repos/alibaba/ARouter/hooks","issue_events_url":"https://api.github.com/repos/alibaba/ARouter/issues/events{/number}","events_url":"https://api.github.com/repos/alibaba/ARouter/events","assignees_url":"https://api.github.com/repos/alibaba/ARouter/assignees{/user}","branches_url":"https://api.github.com/repos/alibaba/ARouter/branches{/branch}","tags_url":"https://api.github.com/repos/alibaba/ARouter/tags","blobs_url":"https://api.github.com/repos/alibaba/ARouter/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/alibaba/ARouter/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/alibaba/ARouter/git/refs{/sha}","trees_url":"https://api.github.com/repos/alibaba/ARouter/git/trees{/sha}","statuses_url":"https://api.github.com/repos/alibaba/ARouter/statuses/{sha}","languages_url":"https://api.github.com/repos/alibaba/ARouter/languages","stargazers_url":"https://api.github.com/repos/alibaba/ARouter/stargazers","contributors_url":"https://api.github.com/repos/alibaba/ARouter/contributors","subscribers_url":"https://api.github.com/repos/alibaba/ARouter/subscribers","subscription_url":"https://api.github.com/repos/alibaba/ARouter/subscription","commits_url":"https://api.github.com/repos/alibaba/ARouter/commits{/sha}","git_commits_url":"https://api.github.com/repos/alibaba/ARouter/git/commits{/sha}","comments_url":"https://api.github.com/repos/alibaba/ARouter/comments{/number}","issue_comment_url":"https://api.github.com/repos/alibaba/ARouter/issues/comments{/number}","contents_url":"https://api.github.com/repos/alibaba/ARouter/contents/{+path}","compare_url":"https://api.github.com/repos/alibaba/ARouter/compare/{base}...{head}","merges_url":"https://api.github.com/repos/alibaba/ARouter/merges","archive_url":"https://api.github.com/repos/alibaba/ARouter/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/alibaba/ARouter/downloads","issues_url":"https://api.github.com/repos/alibaba/ARouter/issues{/number}","pulls_url":"https://api.github.com/repos/alibaba/ARouter/pulls{/number}","milestones_url":"https://api.github.com/repos/alibaba/ARouter/milestones{/number}","notifications_url":"https://api.github.com/repos/alibaba/ARouter/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/alibaba/ARouter/labels{/name}","releases_url":"https://api.github.com/repos/alibaba/ARouter/releases{/id}","deployments_url":"https://api.github.com/repos/alibaba/ARouter/deployments","created_at":"2016-12-14T01:27:49Z","updated_at":"2019-09-01T06:30:37Z","pushed_at":"2019-08-06T05:40:52Z","git_url":"git://github.com/alibaba/ARouter.git","ssh_url":"git@github.com:alibaba/ARouter.git","clone_url":"https://github.com/alibaba/ARouter.git","svn_url":"https://github.com/alibaba/ARouter","homepage":"","size":24144,"stargazers_count":10591,"watchers_count":10591,"language":"Java","has_issues":true,"has_projects":true,"has_downloads":true,"has_wiki":true,"has_pages":false,"forks_count":1773,"mirror_url":null,"archived":false,"disabled":false,"open_issues_count":31,"license":{"key":"apache-2.0","name":"Apache License 2.0","spdx_id":"Apache-2.0","url":"https://api.github.com/licenses/apache-2.0","node_id":"MDc6TGljZW5zZTI="},"forks":1773,"open_issues":31,"watchers":10591,"default_branch":"master","score":41.861984},{"id":28550872,"node_id":"MDEwOlJlcG9zaXRvcnkyODU1MDg3Mg==","name":"Android-PickerView","full_name":"Bigkoo/Android-PickerView","private":false,"owner":{"login":"Bigkoo","id":25974450,"node_id":"MDEyOk9yZ2FuaXphdGlvbjI1OTc0NDUw","avatar_url":"https://avatars0.githubusercontent.com/u/25974450?v=4","gravatar_id":"","url":"https://api.github.com/users/Bigkoo","html_url":"https://github.com/Bigkoo","followers_url":"https://api.github.com/users/Bigkoo/followers","following_url":"https://api.github.com/users/Bigkoo/following{/other_user}","gists_url":"https://api.github.com/users/Bigkoo/gists{/gist_id}","starred_url":"https://api.github.com/users/Bigkoo/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/Bigkoo/subscriptions","organizations_url":"https://api.github.com/users/Bigkoo/orgs","repos_url":"https://api.github.com/users/Bigkoo/repos","events_url":"https://api.github.com/users/Bigkoo/events{/privacy}","received_events_url":"https://api.github.com/users/Bigkoo/received_events","type":"Organization","site_admin":false},"html_url":"https://github.com/Bigkoo/Android-PickerView","description":"This is a picker view for android , support linkage effect, timepicker and optionspicker.（时间选择器、省市区三级联动）","fork":false,"url":"https://api.github.com/repos/Bigkoo/Android-PickerView","forks_url":"https://api.github.com/repos/Bigkoo/Android-PickerView/forks","keys_url":"https://api.github.com/repos/Bigkoo/Android-PickerView/keys{/key_id}","collaborators_url":"https://api.github.com/repos/Bigkoo/Android-PickerView/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/Bigkoo/Android-PickerView/teams","hooks_url":"https://api.github.com/repos/Bigkoo/Android-PickerView/hooks","issue_events_url":"https://api.github.com/repos/Bigkoo/Android-PickerView/issues/events{/number}","events_url":"https://api.github.com/repos/Bigkoo/Android-PickerView/events","assignees_url":"https://api.github.com/repos/Bigkoo/Android-PickerView/assignees{/user}","branches_url":"https://api.github.com/repos/Bigkoo/Android-PickerView/branches{/branch}","tags_url":"https://api.github.com/repos/Bigkoo/Android-PickerView/tags","blobs_url":"https://api.github.com/repos/Bigkoo/Android-PickerView/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/Bigkoo/Android-PickerView/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/Bigkoo/Android-PickerView/git/refs{/sha}","trees_url":"https://api.github.com/repos/Bigkoo/Android-PickerView/git/trees{/sha}","statuses_url":"https://api.github.com/repos/Bigkoo/Android-PickerView/statuses/{sha}","languages_url":"https://api.github.com/repos/Bigkoo/Android-PickerView/languages","stargazers_url":"https://api.github.com/repos/Bigkoo/Android-PickerView/stargazers","contributors_url":"https://api.github.com/repos/Bigkoo/Android-PickerView/contributors","subscribers_url":"https://api.github.com/repos/Bigkoo/Android-PickerView/subscribers","subscription_url":"https://api.github.com/repos/Bigkoo/Android-PickerView/subscription","commits_url":"https://api.github.com/repos/Bigkoo/Android-PickerView/commits{/sha}","git_commits_url":"https://api.github.com/repos/Bigkoo/Android-PickerView/git/commits{/sha}","comments_url":"https://api.github.com/repos/Bigkoo/Android-PickerView/comments{/number}","issue_comment_url":"https://api.github.com/repos/Bigkoo/Android-PickerView/issues/comments{/number}","contents_url":"https://api.github.com/repos/Bigkoo/Android-PickerView/contents/{+path}","compare_url":"https://api.github.com/repos/Bigkoo/Android-PickerView/compare/{base}...{head}","merges_url":"https://api.github.com/repos/Bigkoo/Android-PickerView/merges","archive_url":"https://api.github.com/repos/Bigkoo/Android-PickerView/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/Bigkoo/Android-PickerView/downloads","issues_url":"https://api.github.com/repos/Bigkoo/Android-PickerView/issues{/number}","pulls_url":"https://api.github.com/repos/Bigkoo/Android-PickerView/pulls{/number}","milestones_url":"https://api.github.com/repos/Bigkoo/Android-PickerView/milestones{/number}","notifications_url":"https://api.github.com/repos/Bigkoo/Android-PickerView/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/Bigkoo/Android-PickerView/labels{/name}","releases_url":"https://api.github.com/repos/Bigkoo/Android-PickerView/releases{/id}","deployments_url":"https://api.github.com/repos/Bigkoo/Android-PickerView/deployments","created_at":"2014-12-28T01:46:38Z","updated_at":"2019-09-01T02:12:22Z","pushed_at":"2019-08-02T06:54:24Z","git_url":"git://github.com/Bigkoo/Android-PickerView.git","ssh_url":"git@github.com:Bigkoo/Android-PickerView.git","clone_url":"https://github.com/Bigkoo/Android-PickerView.git","svn_url":"https://github.com/Bigkoo/Android-PickerView","homepage":"","size":6340,"stargazers_count":10567,"watchers_count":10567,"language":"Java","has_issues":true,"has_projects":true,"has_downloads":true,"has_wiki":true,"has_pages":false,"forks_count":2688,"mirror_url":null,"archived":false,"disabled":false,"open_issues_count":264,"license":{"key":"apache-2.0","name":"Apache License 2.0","spdx_id":"Apache-2.0","url":"https://api.github.com/licenses/apache-2.0","node_id":"MDc6TGljZW5zZTI="},"forks":2688,"open_issues":264,"watchers":10567,"default_branch":"master","score":63.98459},{"id":25201361,"node_id":"MDEwOlJlcG9zaXRvcnkyNTIwMTM2MQ==","name":"bytecode-viewer","full_name":"Konloch/bytecode-viewer","private":false,"owner":{"login":"Konloch","id":1207403,"node_id":"MDQ6VXNlcjEyMDc0MDM=","avatar_url":"https://avatars0.githubusercontent.com/u/1207403?v=4","gravatar_id":"","url":"https://api.github.com/users/Konloch","html_url":"https://github.com/Konloch","followers_url":"https://api.github.com/users/Konloch/followers","following_url":"https://api.github.com/users/Konloch/following{/other_user}","gists_url":"https://api.github.com/users/Konloch/gists{/gist_id}","starred_url":"https://api.github.com/users/Konloch/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/Konloch/subscriptions","organizations_url":"https://api.github.com/users/Konloch/orgs","repos_url":"https://api.github.com/users/Konloch/repos","events_url":"https://api.github.com/users/Konloch/events{/privacy}","received_events_url":"https://api.github.com/users/Konloch/received_events","type":"User","site_admin":false},"html_url":"https://github.com/Konloch/bytecode-viewer","description":"A Java 8+ Jar & Android APK Reverse Engineering Suite (Decompiler, Editor, Debugger & More)","fork":false,"url":"https://api.github.com/repos/Konloch/bytecode-viewer","forks_url":"https://api.github.com/repos/Konloch/bytecode-viewer/forks","keys_url":"https://api.github.com/repos/Konloch/bytecode-viewer/keys{/key_id}","collaborators_url":"https://api.github.com/repos/Konloch/bytecode-viewer/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/Konloch/bytecode-viewer/teams","hooks_url":"https://api.github.com/repos/Konloch/bytecode-viewer/hooks","issue_events_url":"https://api.github.com/repos/Konloch/bytecode-viewer/issues/events{/number}","events_url":"https://api.github.com/repos/Konloch/bytecode-viewer/events","assignees_url":"https://api.github.com/repos/Konloch/bytecode-viewer/assignees{/user}","branches_url":"https://api.github.com/repos/Konloch/bytecode-viewer/branches{/branch}","tags_url":"https://api.github.com/repos/Konloch/bytecode-viewer/tags","blobs_url":"https://api.github.com/repos/Konloch/bytecode-viewer/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/Konloch/bytecode-viewer/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/Konloch/bytecode-viewer/git/refs{/sha}","trees_url":"https://api.github.com/repos/Konloch/bytecode-viewer/git/trees{/sha}","statuses_url":"https://api.github.com/repos/Konloch/bytecode-viewer/statuses/{sha}","languages_url":"https://api.github.com/repos/Konloch/bytecode-viewer/languages","stargazers_url":"https://api.github.com/repos/Konloch/bytecode-viewer/stargazers","contributors_url":"https://api.github.com/repos/Konloch/bytecode-viewer/contributors","subscribers_url":"https://api.github.com/repos/Konloch/bytecode-viewer/subscribers","subscription_url":"https://api.github.com/repos/Konloch/bytecode-viewer/subscription","commits_url":"https://api.github.com/repos/Konloch/bytecode-viewer/commits{/sha}","git_commits_url":"https://api.github.com/repos/Konloch/bytecode-viewer/git/commits{/sha}","comments_url":"https://api.github.com/repos/Konloch/bytecode-viewer/comments{/number}","issue_comment_url":"https://api.github.com/repos/Konloch/bytecode-viewer/issues/comments{/number}","contents_url":"https://api.github.com/repos/Konloch/bytecode-viewer/contents/{+path}","compare_url":"https://api.github.com/repos/Konloch/bytecode-viewer/compare/{base}...{head}","merges_url":"https://api.github.com/repos/Konloch/bytecode-viewer/merges","archive_url":"https://api.github.com/repos/Konloch/bytecode-viewer/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/Konloch/bytecode-viewer/downloads","issues_url":"https://api.github.com/repos/Konloch/bytecode-viewer/issues{/number}","pulls_url":"https://api.github.com/repos/Konloch/bytecode-viewer/pulls{/number}","milestones_url":"https://api.github.com/repos/Konloch/bytecode-viewer/milestones{/number}","notifications_url":"https://api.github.com/repos/Konloch/bytecode-viewer/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/Konloch/bytecode-viewer/labels{/name}","releases_url":"https://api.github.com/repos/Konloch/bytecode-viewer/releases{/id}","deployments_url":"https://api.github.com/repos/Konloch/bytecode-viewer/deployments","created_at":"2014-10-14T10:26:46Z","updated_at":"2019-09-01T01:01:27Z","pushed_at":"2019-08-11T04:48:21Z","git_url":"git://github.com/Konloch/bytecode-viewer.git","ssh_url":"git@github.com:Konloch/bytecode-viewer.git","clone_url":"https://github.com/Konloch/bytecode-viewer.git","svn_url":"https://github.com/Konloch/bytecode-viewer","homepage":"https://bytecodeviewer.com","size":574377,"stargazers_count":10494,"watchers_count":10494,"language":"Java","has_issues":true,"has_projects":true,"has_downloads":true,"has_wiki":false,"has_pages":false,"forks_count":677,"mirror_url":null,"archived":false,"disabled":false,"open_issues_count":39,"license":{"key":"gpl-3.0","name":"GNU General Public License v3.0","spdx_id":"GPL-3.0","url":"https://api.github.com/licenses/gpl-3.0","node_id":"MDc6TGljZW5zZTk="},"forks":677,"open_issues":39,"watchers":10494,"default_branch":"master","score":34.06343}]
     */

    private int total_count;
    private boolean incomplete_results;
    private List<ItemsBean> items;

    public int getTotal_count() {
        return total_count;
    }

    public void setTotal_count(int total_count) {
        this.total_count = total_count;
    }

    public boolean isIncomplete_results() {
        return incomplete_results;
    }

    public void setIncomplete_results(boolean incomplete_results) {
        this.incomplete_results = incomplete_results;
    }

    public List<ItemsBean> getItems() {
        return items;
    }

    public void setItems(List<ItemsBean> items) {
        this.items = items;
    }

    public static class ItemsBean {
        /**
         * id : 5152285
         * node_id : MDEwOlJlcG9zaXRvcnk1MTUyMjg1
         * name : okhttp
         * full_name : square/okhttp
         * private : false
         * owner : {"login":"square","id":82592,"node_id":"MDEyOk9yZ2FuaXphdGlvbjgyNTky","avatar_url":"https://avatars0.githubusercontent.com/u/82592?v=4","gravatar_id":"","url":"https://api.github.com/users/square","html_url":"https://github.com/square","followers_url":"https://api.github.com/users/square/followers","following_url":"https://api.github.com/users/square/following{/other_user}","gists_url":"https://api.github.com/users/square/gists{/gist_id}","starred_url":"https://api.github.com/users/square/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/square/subscriptions","organizations_url":"https://api.github.com/users/square/orgs","repos_url":"https://api.github.com/users/square/repos","events_url":"https://api.github.com/users/square/events{/privacy}","received_events_url":"https://api.github.com/users/square/received_events","type":"Organization","site_admin":false}
         * html_url : https://github.com/square/okhttp
         * description : An HTTP client for Android, Kotlin, and Java.
         * fork : false
         * url : https://api.github.com/repos/square/okhttp
         * forks_url : https://api.github.com/repos/square/okhttp/forks
         * keys_url : https://api.github.com/repos/square/okhttp/keys{/key_id}
         * collaborators_url : https://api.github.com/repos/square/okhttp/collaborators{/collaborator}
         * teams_url : https://api.github.com/repos/square/okhttp/teams
         * hooks_url : https://api.github.com/repos/square/okhttp/hooks
         * issue_events_url : https://api.github.com/repos/square/okhttp/issues/events{/number}
         * events_url : https://api.github.com/repos/square/okhttp/events
         * assignees_url : https://api.github.com/repos/square/okhttp/assignees{/user}
         * branches_url : https://api.github.com/repos/square/okhttp/branches{/branch}
         * tags_url : https://api.github.com/repos/square/okhttp/tags
         * blobs_url : https://api.github.com/repos/square/okhttp/git/blobs{/sha}
         * git_tags_url : https://api.github.com/repos/square/okhttp/git/tags{/sha}
         * git_refs_url : https://api.github.com/repos/square/okhttp/git/refs{/sha}
         * trees_url : https://api.github.com/repos/square/okhttp/git/trees{/sha}
         * statuses_url : https://api.github.com/repos/square/okhttp/statuses/{sha}
         * languages_url : https://api.github.com/repos/square/okhttp/languages
         * stargazers_url : https://api.github.com/repos/square/okhttp/stargazers
         * contributors_url : https://api.github.com/repos/square/okhttp/contributors
         * subscribers_url : https://api.github.com/repos/square/okhttp/subscribers
         * subscription_url : https://api.github.com/repos/square/okhttp/subscription
         * commits_url : https://api.github.com/repos/square/okhttp/commits{/sha}
         * git_commits_url : https://api.github.com/repos/square/okhttp/git/commits{/sha}
         * comments_url : https://api.github.com/repos/square/okhttp/comments{/number}
         * issue_comment_url : https://api.github.com/repos/square/okhttp/issues/comments{/number}
         * contents_url : https://api.github.com/repos/square/okhttp/contents/{+path}
         * compare_url : https://api.github.com/repos/square/okhttp/compare/{base}...{head}
         * merges_url : https://api.github.com/repos/square/okhttp/merges
         * archive_url : https://api.github.com/repos/square/okhttp/{archive_format}{/ref}
         * downloads_url : https://api.github.com/repos/square/okhttp/downloads
         * issues_url : https://api.github.com/repos/square/okhttp/issues{/number}
         * pulls_url : https://api.github.com/repos/square/okhttp/pulls{/number}
         * milestones_url : https://api.github.com/repos/square/okhttp/milestones{/number}
         * notifications_url : https://api.github.com/repos/square/okhttp/notifications{?since,all,participating}
         * labels_url : https://api.github.com/repos/square/okhttp/labels{/name}
         * releases_url : https://api.github.com/repos/square/okhttp/releases{/id}
         * deployments_url : https://api.github.com/repos/square/okhttp/deployments
         * created_at : 2012-07-23T13:42:55Z
         * updated_at : 2019-09-01T06:52:14Z
         * pushed_at : 2019-08-31T06:43:24Z
         * git_url : git://github.com/square/okhttp.git
         * ssh_url : git@github.com:square/okhttp.git
         * clone_url : https://github.com/square/okhttp.git
         * svn_url : https://github.com/square/okhttp
         * homepage : http://square.github.io/okhttp/
         * size : 27316
         * stargazers_count : 34110
         * watchers_count : 34110
         * language : Java
         * has_issues : true
         * has_projects : false
         * has_downloads : true
         * has_wiki : true
         * has_pages : true
         * forks_count : 7429
         * mirror_url : null
         * archived : false
         * disabled : false
         * open_issues_count : 188
         * license : {"key":"apache-2.0","name":"Apache License 2.0","spdx_id":"Apache-2.0","url":"https://api.github.com/licenses/apache-2.0","node_id":"MDc6TGljZW5zZTI="}
         * forks : 7429
         * open_issues : 188
         * watchers : 34110
         * default_branch : master
         * score : 52.360664
         */

        private int id;
        private String node_id;
        private String name;
        private String full_name;

        @SerializedName("private")
        private boolean privateX;
        private OwnerBean owner;
        private String html_url;
        private String description;
        private boolean fork;
        private String url;
        private String forks_url;
        private String keys_url;
        private String collaborators_url;
        private String teams_url;
        private String hooks_url;
        private String issue_events_url;
        private String events_url;
        private String assignees_url;
        private String branches_url;
        private String tags_url;
        private String blobs_url;
        private String git_tags_url;
        private String git_refs_url;
        private String trees_url;
        private String statuses_url;
        private String languages_url;
        private String stargazers_url;
        private String contributors_url;
        private String subscribers_url;
        private String subscription_url;
        private String commits_url;
        private String git_commits_url;
        private String comments_url;
        private String issue_comment_url;
        private String contents_url;
        private String compare_url;
        private String merges_url;
        private String archive_url;
        private String downloads_url;
        private String issues_url;
        private String pulls_url;
        private String milestones_url;
        private String notifications_url;
        private String labels_url;
        private String releases_url;
        private String deployments_url;
        private String created_at;
        private String updated_at;
        private String pushed_at;
        private String git_url;
        private String ssh_url;
        private String clone_url;
        private String svn_url;
        private String homepage;
        private int size;
        private int stargazers_count;
        private int watchers_count;
        private String language;
        private boolean has_issues;
        private boolean has_projects;
        private boolean has_downloads;
        private boolean has_wiki;
        private boolean has_pages;
        private int forks_count;
        private Object mirror_url;
        private boolean archived;
        private boolean disabled;
        private int open_issues_count;
        private LicenseBean license;
        private int forks;
        private int open_issues;
        private int watchers;
        private String default_branch;
        private double score;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNode_id() {
            return node_id;
        }

        public void setNode_id(String node_id) {
            this.node_id = node_id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFull_name() {
            return full_name;
        }

        public void setFull_name(String full_name) {
            this.full_name = full_name;
        }

        public boolean isPrivateX() {
            return privateX;
        }

        public void setPrivateX(boolean privateX) {
            this.privateX = privateX;
        }

        public OwnerBean getOwner() {
            return owner;
        }

        public void setOwner(OwnerBean owner) {
            this.owner = owner;
        }

        public String getHtml_url() {
            return html_url;
        }

        public void setHtml_url(String html_url) {
            this.html_url = html_url;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public boolean isFork() {
            return fork;
        }

        public void setFork(boolean fork) {
            this.fork = fork;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getForks_url() {
            return forks_url;
        }

        public void setForks_url(String forks_url) {
            this.forks_url = forks_url;
        }

        public String getKeys_url() {
            return keys_url;
        }

        public void setKeys_url(String keys_url) {
            this.keys_url = keys_url;
        }

        public String getCollaborators_url() {
            return collaborators_url;
        }

        public void setCollaborators_url(String collaborators_url) {
            this.collaborators_url = collaborators_url;
        }

        public String getTeams_url() {
            return teams_url;
        }

        public void setTeams_url(String teams_url) {
            this.teams_url = teams_url;
        }

        public String getHooks_url() {
            return hooks_url;
        }

        public void setHooks_url(String hooks_url) {
            this.hooks_url = hooks_url;
        }

        public String getIssue_events_url() {
            return issue_events_url;
        }

        public void setIssue_events_url(String issue_events_url) {
            this.issue_events_url = issue_events_url;
        }

        public String getEvents_url() {
            return events_url;
        }

        public void setEvents_url(String events_url) {
            this.events_url = events_url;
        }

        public String getAssignees_url() {
            return assignees_url;
        }

        public void setAssignees_url(String assignees_url) {
            this.assignees_url = assignees_url;
        }

        public String getBranches_url() {
            return branches_url;
        }

        public void setBranches_url(String branches_url) {
            this.branches_url = branches_url;
        }

        public String getTags_url() {
            return tags_url;
        }

        public void setTags_url(String tags_url) {
            this.tags_url = tags_url;
        }

        public String getBlobs_url() {
            return blobs_url;
        }

        public void setBlobs_url(String blobs_url) {
            this.blobs_url = blobs_url;
        }

        public String getGit_tags_url() {
            return git_tags_url;
        }

        public void setGit_tags_url(String git_tags_url) {
            this.git_tags_url = git_tags_url;
        }

        public String getGit_refs_url() {
            return git_refs_url;
        }

        public void setGit_refs_url(String git_refs_url) {
            this.git_refs_url = git_refs_url;
        }

        public String getTrees_url() {
            return trees_url;
        }

        public void setTrees_url(String trees_url) {
            this.trees_url = trees_url;
        }

        public String getStatuses_url() {
            return statuses_url;
        }

        public void setStatuses_url(String statuses_url) {
            this.statuses_url = statuses_url;
        }

        public String getLanguages_url() {
            return languages_url;
        }

        public void setLanguages_url(String languages_url) {
            this.languages_url = languages_url;
        }

        public String getStargazers_url() {
            return stargazers_url;
        }

        public void setStargazers_url(String stargazers_url) {
            this.stargazers_url = stargazers_url;
        }

        public String getContributors_url() {
            return contributors_url;
        }

        public void setContributors_url(String contributors_url) {
            this.contributors_url = contributors_url;
        }

        public String getSubscribers_url() {
            return subscribers_url;
        }

        public void setSubscribers_url(String subscribers_url) {
            this.subscribers_url = subscribers_url;
        }

        public String getSubscription_url() {
            return subscription_url;
        }

        public void setSubscription_url(String subscription_url) {
            this.subscription_url = subscription_url;
        }

        public String getCommits_url() {
            return commits_url;
        }

        public void setCommits_url(String commits_url) {
            this.commits_url = commits_url;
        }

        public String getGit_commits_url() {
            return git_commits_url;
        }

        public void setGit_commits_url(String git_commits_url) {
            this.git_commits_url = git_commits_url;
        }

        public String getComments_url() {
            return comments_url;
        }

        public void setComments_url(String comments_url) {
            this.comments_url = comments_url;
        }

        public String getIssue_comment_url() {
            return issue_comment_url;
        }

        public void setIssue_comment_url(String issue_comment_url) {
            this.issue_comment_url = issue_comment_url;
        }

        public String getContents_url() {
            return contents_url;
        }

        public void setContents_url(String contents_url) {
            this.contents_url = contents_url;
        }

        public String getCompare_url() {
            return compare_url;
        }

        public void setCompare_url(String compare_url) {
            this.compare_url = compare_url;
        }

        public String getMerges_url() {
            return merges_url;
        }

        public void setMerges_url(String merges_url) {
            this.merges_url = merges_url;
        }

        public String getArchive_url() {
            return archive_url;
        }

        public void setArchive_url(String archive_url) {
            this.archive_url = archive_url;
        }

        public String getDownloads_url() {
            return downloads_url;
        }

        public void setDownloads_url(String downloads_url) {
            this.downloads_url = downloads_url;
        }

        public String getIssues_url() {
            return issues_url;
        }

        public void setIssues_url(String issues_url) {
            this.issues_url = issues_url;
        }

        public String getPulls_url() {
            return pulls_url;
        }

        public void setPulls_url(String pulls_url) {
            this.pulls_url = pulls_url;
        }

        public String getMilestones_url() {
            return milestones_url;
        }

        public void setMilestones_url(String milestones_url) {
            this.milestones_url = milestones_url;
        }

        public String getNotifications_url() {
            return notifications_url;
        }

        public void setNotifications_url(String notifications_url) {
            this.notifications_url = notifications_url;
        }

        public String getLabels_url() {
            return labels_url;
        }

        public void setLabels_url(String labels_url) {
            this.labels_url = labels_url;
        }

        public String getReleases_url() {
            return releases_url;
        }

        public void setReleases_url(String releases_url) {
            this.releases_url = releases_url;
        }

        public String getDeployments_url() {
            return deployments_url;
        }

        public void setDeployments_url(String deployments_url) {
            this.deployments_url = deployments_url;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public String getPushed_at() {
            return pushed_at;
        }

        public void setPushed_at(String pushed_at) {
            this.pushed_at = pushed_at;
        }

        public String getGit_url() {
            return git_url;
        }

        public void setGit_url(String git_url) {
            this.git_url = git_url;
        }

        public String getSsh_url() {
            return ssh_url;
        }

        public void setSsh_url(String ssh_url) {
            this.ssh_url = ssh_url;
        }

        public String getClone_url() {
            return clone_url;
        }

        public void setClone_url(String clone_url) {
            this.clone_url = clone_url;
        }

        public String getSvn_url() {
            return svn_url;
        }

        public void setSvn_url(String svn_url) {
            this.svn_url = svn_url;
        }

        public String getHomepage() {
            return homepage;
        }

        public void setHomepage(String homepage) {
            this.homepage = homepage;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getStargazers_count() {
            return stargazers_count;
        }

        public void setStargazers_count(int stargazers_count) {
            this.stargazers_count = stargazers_count;
        }

        public int getWatchers_count() {
            return watchers_count;
        }

        public void setWatchers_count(int watchers_count) {
            this.watchers_count = watchers_count;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public boolean isHas_issues() {
            return has_issues;
        }

        public void setHas_issues(boolean has_issues) {
            this.has_issues = has_issues;
        }

        public boolean isHas_projects() {
            return has_projects;
        }

        public void setHas_projects(boolean has_projects) {
            this.has_projects = has_projects;
        }

        public boolean isHas_downloads() {
            return has_downloads;
        }

        public void setHas_downloads(boolean has_downloads) {
            this.has_downloads = has_downloads;
        }

        public boolean isHas_wiki() {
            return has_wiki;
        }

        public void setHas_wiki(boolean has_wiki) {
            this.has_wiki = has_wiki;
        }

        public boolean isHas_pages() {
            return has_pages;
        }

        public void setHas_pages(boolean has_pages) {
            this.has_pages = has_pages;
        }

        public int getForks_count() {
            return forks_count;
        }

        public void setForks_count(int forks_count) {
            this.forks_count = forks_count;
        }

        public Object getMirror_url() {
            return mirror_url;
        }

        public void setMirror_url(Object mirror_url) {
            this.mirror_url = mirror_url;
        }

        public boolean isArchived() {
            return archived;
        }

        public void setArchived(boolean archived) {
            this.archived = archived;
        }

        public boolean isDisabled() {
            return disabled;
        }

        public void setDisabled(boolean disabled) {
            this.disabled = disabled;
        }

        public int getOpen_issues_count() {
            return open_issues_count;
        }

        public void setOpen_issues_count(int open_issues_count) {
            this.open_issues_count = open_issues_count;
        }

        public LicenseBean getLicense() {
            return license;
        }

        public void setLicense(LicenseBean license) {
            this.license = license;
        }

        public int getForks() {
            return forks;
        }

        public void setForks(int forks) {
            this.forks = forks;
        }

        public int getOpen_issues() {
            return open_issues;
        }

        public void setOpen_issues(int open_issues) {
            this.open_issues = open_issues;
        }

        public int getWatchers() {
            return watchers;
        }

        public void setWatchers(int watchers) {
            this.watchers = watchers;
        }

        public String getDefault_branch() {
            return default_branch;
        }

        public void setDefault_branch(String default_branch) {
            this.default_branch = default_branch;
        }

        public double getScore() {
            return score;
        }

        public void setScore(double score) {
            this.score = score;
        }

        public static class OwnerBean {
            /**
             * login : square
             * id : 82592
             * node_id : MDEyOk9yZ2FuaXphdGlvbjgyNTky
             * avatar_url : https://avatars0.githubusercontent.com/u/82592?v=4
             * gravatar_id :
             * url : https://api.github.com/users/square
             * html_url : https://github.com/square
             * followers_url : https://api.github.com/users/square/followers
             * following_url : https://api.github.com/users/square/following{/other_user}
             * gists_url : https://api.github.com/users/square/gists{/gist_id}
             * starred_url : https://api.github.com/users/square/starred{/owner}{/repo}
             * subscriptions_url : https://api.github.com/users/square/subscriptions
             * organizations_url : https://api.github.com/users/square/orgs
             * repos_url : https://api.github.com/users/square/repos
             * events_url : https://api.github.com/users/square/events{/privacy}
             * received_events_url : https://api.github.com/users/square/received_events
             * type : Organization
             * site_admin : false
             */

            private String login;
            private int id;
            private String node_id;
            private String avatar_url;
            private String gravatar_id;
            private String url;
            private String html_url;
            private String followers_url;
            private String following_url;
            private String gists_url;
            private String starred_url;
            private String subscriptions_url;
            private String organizations_url;
            private String repos_url;
            private String events_url;
            private String received_events_url;
            private String type;
            private boolean site_admin;

            public String getLogin() {
                return login;
            }

            public void setLogin(String login) {
                this.login = login;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getNode_id() {
                return node_id;
            }

            public void setNode_id(String node_id) {
                this.node_id = node_id;
            }

            public String getAvatar_url() {
                return avatar_url;
            }

            public void setAvatar_url(String avatar_url) {
                this.avatar_url = avatar_url;
            }

            public String getGravatar_id() {
                return gravatar_id;
            }

            public void setGravatar_id(String gravatar_id) {
                this.gravatar_id = gravatar_id;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getHtml_url() {
                return html_url;
            }

            public void setHtml_url(String html_url) {
                this.html_url = html_url;
            }

            public String getFollowers_url() {
                return followers_url;
            }

            public void setFollowers_url(String followers_url) {
                this.followers_url = followers_url;
            }

            public String getFollowing_url() {
                return following_url;
            }

            public void setFollowing_url(String following_url) {
                this.following_url = following_url;
            }

            public String getGists_url() {
                return gists_url;
            }

            public void setGists_url(String gists_url) {
                this.gists_url = gists_url;
            }

            public String getStarred_url() {
                return starred_url;
            }

            public void setStarred_url(String starred_url) {
                this.starred_url = starred_url;
            }

            public String getSubscriptions_url() {
                return subscriptions_url;
            }

            public void setSubscriptions_url(String subscriptions_url) {
                this.subscriptions_url = subscriptions_url;
            }

            public String getOrganizations_url() {
                return organizations_url;
            }

            public void setOrganizations_url(String organizations_url) {
                this.organizations_url = organizations_url;
            }

            public String getRepos_url() {
                return repos_url;
            }

            public void setRepos_url(String repos_url) {
                this.repos_url = repos_url;
            }

            public String getEvents_url() {
                return events_url;
            }

            public void setEvents_url(String events_url) {
                this.events_url = events_url;
            }

            public String getReceived_events_url() {
                return received_events_url;
            }

            public void setReceived_events_url(String received_events_url) {
                this.received_events_url = received_events_url;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public boolean isSite_admin() {
                return site_admin;
            }

            public void setSite_admin(boolean site_admin) {
                this.site_admin = site_admin;
            }
        }

        public static class LicenseBean {
            /**
             * key : apache-2.0
             * name : Apache License 2.0
             * spdx_id : Apache-2.0
             * url : https://api.github.com/licenses/apache-2.0
             * node_id : MDc6TGljZW5zZTI=
             */

            private String key;
            private String name;
            private String spdx_id;
            private String url;
            private String node_id;

            public String getKey() {
                return key;
            }

            public void setKey(String key) {
                this.key = key;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getSpdx_id() {
                return spdx_id;
            }

            public void setSpdx_id(String spdx_id) {
                this.spdx_id = spdx_id;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getNode_id() {
                return node_id;
            }

            public void setNode_id(String node_id) {
                this.node_id = node_id;
            }
        }
    }
    //https://api.github.com/search/repositories?q=Android in:name,description+language:java,kotlin&sort=stars&order=desc

}
