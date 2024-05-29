sudo /home/femu/ScalaAFA/rocksdb/db_bench -spdk ./test/config_nvme.json -spdk_bdev nvme0n1 -spdk_cache_size 4096 \
--benchmarks="readrandomwriterandom,stats" \
--readwritepercent=50 \
--num=10000000 \
--threads=1 \
--key_size=16 \
--value_size=1000 \
--block_size=4096 \
--cache_size=0 \
--open_files=500000 \
--sync=0 \
--compression_type=none \
--compression_ratio=1 \
--target_file_size_base=67108864 \
--max_write_buffer_number=3 \
--max_bytes_for_level_multiplier=10 \
--max_background_compactions=10 \
--num_levels=10 \
--delete_obsolete_files_period_micros=3000000 \
--stats_per_interval=1 \
--max_bytes_for_level_base=10485760 \
--disable_wal=true \
--mmap_read=0 \
--histogram=1 \
--statistics=1 \
--bloom_bits=10 \
--cache_numshardbits=4